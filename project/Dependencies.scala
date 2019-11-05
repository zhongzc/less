import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8"

  // Jetty
  lazy val jettyVersion = "9.4.18.v20190429"
  lazy val jetty = Seq(
    "org.eclipse.jetty" % "jetty-servlet" % jettyVersion,
    "org.eclipse.jetty" % "jetty-server"  % jettyVersion
  )

  // Logging
  lazy val logging = Seq(
    "ch.qos.logback"             % "logback-classic" % "1.2.3",
    "com.typesafe.scala-logging" %% "scala-logging"  % "3.9.2"
  )
}
