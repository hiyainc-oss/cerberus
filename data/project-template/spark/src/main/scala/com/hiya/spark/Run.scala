package com.hiya.spark

import org.apache.spark.sql.SparkSession

object Run extends App {

  val spark = SparkSession
    .builder()
    .master("local")
    .appName("spark session")
    .config("spark.sql.shuffle.partitions", "1")
    .getOrCreate()

  println(spark.version)
}
