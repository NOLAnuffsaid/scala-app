name := "scala-app"

version := "1.0"

scalaVersion := "2.11.8"

// Dependencies

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.0" % "test",
  "org.scala-lang" % "scala-reflect" % "2.11.8",
  "io.argonaut" %% "argonaut" % "6.1",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.4"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")
