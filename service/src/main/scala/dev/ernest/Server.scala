package dev.ernest

import java.nio.file.Paths

import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.{HttpApp, Route}

object Server extends HttpApp {

  override def routes: Route =
    path("hello") {
      get {
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, s"<h1>Say hello to akka-http</h1>"))
      }
    } ~
    path("agent") {
      val agent = Paths.get(System.getProperty("user.dir"), "../agent/target/debug/agent").toFile
      require(agent.exists(), s"Agent does not exist in ${agent.getAbsolutePath}")
      getFromFile(agent, ContentTypes.`application/octet-stream`)
    }

  def main(args: Array[String]): Unit = {
    startServer("localhost", 1899)
  }
}
