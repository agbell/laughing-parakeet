name := "laughing-parakeet"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-core" % "2.4.10",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.10",
  "com.hunorkovacs" %% "koauth" % "1.1.0",
  "org.json4s" %% "json4s-native" % "3.3.0",

  //datetime
 "joda-time" % "joda-time" % "2.7",

  //emoji
 "com.vdurmont" % "emoji-java" % "3.1.3"
)