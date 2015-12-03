name := "macros"

version := "1.0"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-Xlog-free-terms", "-unchecked")

resolvers += "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

addCompilerPlugin("org.scalamacros" % "paradise_2.10.4" % "2.1.0")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.10.4",
  "org.scalamacros" % "paradise_2.10.4" % "2.1.0",
  "org.scalamacros" % "quasiquotes_2.10" % "2.1.0"
)




