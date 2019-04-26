package dev.ernest

import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.{HttpApp, Route}

import scala.io.Source

object Server extends HttpApp {

  override def routes: Route =
    path("hello") {
      get {
        val resource = Source.fromResource("foo").getLines().mkString(",")
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, s"<h1>Say $resource to akka-http</h1>"))
      }
    }

  def main(args: Array[String]): Unit = {
    startServer("localhost", 1899)
  }
}
