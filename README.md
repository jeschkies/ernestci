# Ernest CI

Ernest is a self-hosted continuous integration on top of [Mesos](http://mesos.apache.org/) or [Nomad](https://www.nomadproject.io/).
It strives to offer the simplicity of use of Travis CI and Circle CI but the flexibility of Jenkins.

# Getting Started

Ernest requires a running Mesos or Nomad cluster. You can either deploy it on a running cluster (1) or deploy a new
cluster from scratch (2). We offer a simply tool that helps you to get started either way.

## Deploy on a Running cluster (1)

`./typewriter deploy`

TODO

## Deploy a New cluster (2)

`./typewriter deploy`

TODO

# Usage

TODO

# Development

Ernest's server is written in [Scala](https://www.scala-lang.org/) and the build agent is written in
[Rust](https://www.rust-lang.org/) `2018 Edition`. Both are built with [Gradle](https://gradle.org/).

1. Install Rust with [rustup](https://www.rust-lang.org/tools/install).
2. Clone the Ernest CI repo `git clone git@github.com:jeschkies/ernestci.git`.
3. Build and test Ernest with `./gradlew check`.

TODO: `./gradlew server`, run local Mesos or Nomad cluster
