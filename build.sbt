scalaVersion in ThisBuild := "2.12.2"

lazy val `scalafix-rewrites` = project.settings(
  resolvers += Resolver.bintrayRepo("scalameta", "maven"),
  libraryDependencies += "ch.epfl.scala" % "scalafix-core" % "0.3.4+30-cff7ae8f" cross CrossVersion.full,
  libraryDependencies += "ch.epfl.scala" %% "scalafix-testkit" % "0.3.4+30-cff7ae8f" % Test
)
