
ThisBuild / Test / parallelExecution := false
Global / scalaVersion := "2.11.12"
ThisBuild / Test / fork := false
ThisBuild / scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Ywarn-unused-import", "-Xlint", "-Ypartial-unification")
ThisBuild / testOptions += Tests.Argument(TestFrameworks.ScalaCheck, "-verbosity", "2") // shows stacktrace
ThisBuild / scalacOptions ++= Seq("-Yrangepos")
Global / cancelable := true
ThisBuild / shellPrompt := { state => Project.extract(state).currentRef.project + "> " }

lazy val `spark-project` = (project in file("spark"))
  .settings(
    libraryDependencies ++= (Dependencies.SparkLibs ++ Dependencies.TestLibs)
  )

lazy val `root` = (project in file("."))
  .aggregate(
    `spark-project`
  )
