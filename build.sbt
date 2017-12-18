
version := "1.0"

scalaVersion := "2.12.2"

lazy val cluster = (project in file("."))
  .enablePlugins(JavaServerAppPackaging)
  .settings(
    name := "cluster-server",
    dockerRepository := Some("universauth"),
    dockerExposedPorts := Seq(2551)
  )

libraryDependencies +=
  "com.typesafe.akka" %% "akka-cluster" % "2.5.8"

    