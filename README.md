Moment API for Scala.js
=======================
This is a Scala.js type-safe binding for [Moment](https://www.npmjs.com/package/moment)

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

#### Example

```scala
val dateString = "9/01/2016 6:17a"
val dateObject = Moment(dateString, "M/DD/YYYY h:mma")
println(s"dateObject => $dateObject") // Thu Sep 01 2016 06:17:00 GMT-0700
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