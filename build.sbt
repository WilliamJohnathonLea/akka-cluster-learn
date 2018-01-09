
version := "1.4"

scalaVersion := "2.12.2"

lazy val cluster = (project in file("."))
  .enablePlugins(JavaServerAppPackaging)
  .settings(
    name := "cluster-server",
    dockerRepository := Some("wjlea93"),
    dockerBaseImage := "openjdk:8-jre-slim",
    dockerExposedPorts := Seq(2551),
    dockerUpdateLatest := false
  )

libraryDependencies +=
  "com.typesafe.akka" %% "akka-cluster" % "2.5.8"

    