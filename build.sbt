name := """jetbrains-issue"""

version := "1.0"

scalaVersion := "2.11.6"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

lazy val root = (project in file("."))
  .dependsOn(someGitRepo)

val someGitHash = "80c2bcb86a44eabe784d835d7456dfbd4bdd12da"

lazy val someGitRepo = RootProject(uri(s"ssh://git@github.com/mavilein/minimal-scala.git#$someGitHash"))

