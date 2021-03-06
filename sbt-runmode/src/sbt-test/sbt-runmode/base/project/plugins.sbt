resolvers ++= Seq(
  Classpaths.typesafeResolver,
  "Web plugin" at "http://siasia.github.com/maven2"
)

libraryDependencies <+= sbtVersion(v => v match {
  case "0.11.0" => "com.github.siasia" %% "xsbt-web-plugin" % "0.11.0-0.2.8"
  case "0.11.1" => "com.github.siasia" %% "xsbt-web-plugin" % "0.11.1-0.2.10"
  case "0.11.2" => "com.github.siasia" %% "xsbt-web-plugin" % "0.11.2-0.2.11"
})

addSbtPlugin("com.untyped" %% "sbt-runmode" % "latest.integration")
