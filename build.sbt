ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "fyers-client-scala",
    idePackagePrefix := Some("com.fyers.api.client")
  )


libraryDependencies ++= Seq(
  "org.apache.logging.log4j" % "log4j-core" % "2.21.1",
  "org.apache.logging.log4j" % "log4j-api" % "2.21.1",
  "org.playframework" %% "play-json" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.3.0-SNAP4" % Test
)