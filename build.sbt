name := "billing"
organization := "com.moviepass"

version := "1.0"

scalaVersion := "2.13.8"

enablePlugins(DockerPlugin)
enablePlugins(JavaAppPackaging)

val port = 9000
dockerBaseImage := "openjdk"
dockerExposedPorts := Seq(port)
// version := "1.0"