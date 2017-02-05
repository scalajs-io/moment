Moment API for Scala.js
=======================
This is a Scala.js type-safe binding for [moment](https://www.npmjs.com/package/moment) and
[moment-timezone](https://www.npmjs.com/package/moment-timezone)

A moment library for NodeJS.

#### Build Dependencies

* [ScalaJs.io v0.3.x](https://github.com/ldaniels528/scalajs.io)
* [SBT v0.13.13](http://www.scala-sbt.org/download.html)

#### Build/publish the SDK locally

```bash
$ sbt clean publish-local
```

#### Run the tests

```bash
$ sbt test
```

#### Examples

```scala
val moment = Moment("9/01/2016 6:17a", "M/DD/YYYY h:mma")
println(moment.toString) // Thu Sep 01 2016 06:17:00 GMT-0700
```

```scala
val moment = Moment("2014-06-01T12:00:00Z")
val output = moment.tz("America/Los_Angeles").format("ha z")
println(output) // 5am PDT
```

#### Artifacts and Resolvers

To add the Moment binding to your project, add the following to your build.sbt:  

```sbt
libraryDependencies += "io.scalajs.npm" %%% "moment" % "0.3.0.3"
```

Optionally, you may add the Sonatype Repository resolver:

```sbt   
resolvers += Resolver.sonatypeRepo("releases") 
```