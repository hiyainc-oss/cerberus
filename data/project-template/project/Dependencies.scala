import sbt._

object Dependencies {

  private val sparkVersion = "2.4.5"

  private val SparkCore  = "org.apache.spark"     %% "spark-core"   % sparkVersion
  private val SparkSql   = "org.apache.spark"     %% "spark-sql"    % sparkVersion
  private val SparkAvro  = "org.apache.spark"     %% "spark-avro"   % sparkVersion
  private val ScalaTest   = "org.scalatest"       %% "scalatest"    % "3.0.7" % Test
  private val ScalaCheck  = "org.scalacheck"      %% "scalacheck"   % "1.14.0" % Test

  val SparkLibs = Seq(
    SparkCore,
    SparkSql,
    SparkAvro
  )

  val TestLibs = Seq(
    ScalaTest,
    ScalaCheck
  )
}
