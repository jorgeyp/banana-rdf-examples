name := "banana-rdf-example"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies += "org.w3" %% "banana-rdf" % "0.8.1"

libraryDependencies += "org.w3" %% "banana-jena" % "0.8.1"

// banana-rdf still has some dependencies that are not yet on Maven Central
resolvers += Resolver.url("inthenow-releases", url("http://dl.bintray.com/inthenow/releases"))(Resolver.ivyStylePatterns)