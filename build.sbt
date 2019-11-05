import Dependencies._

ThisBuild / scalaVersion := "2.12.10"
ThisBuild / version := "0.1.0"
ThisBuild / organization := "com.gaufoo"
ThisBuild / organizationName := "gaufoo"

lazy val root = (project in file("."))
  .settings(
    name := "less",
    libraryDependencies ++= logging,
    libraryDependencies += scalaTest % Test
  )

addCommandAlias("fmt", "all root/scalafmtSbt root/scalafmtAll")
addCommandAlias("check", "all root/scalafmtSbtCheck root/scalafmtCheckAll")
