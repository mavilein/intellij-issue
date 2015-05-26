name := """jetbrains-issue"""

version := "1.0"

scalaVersion := "2.11.6"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

lazy val root = (project in file("."))
  .dependsOn(someGitRepo)

val someGitHash = "640af77f932085f0a623c106ed89a573f69e8262"

lazy val someGitRepo = RootProject(uri(s"ssh://git@github.com/mavilein/minimal-scala.git#$someGitHash"))

