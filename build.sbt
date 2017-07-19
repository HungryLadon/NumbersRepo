name := "Exercises"

version := "1.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
//wartremoverErrors ++= Warts.unsafe
wartremoverExcluded += baseDirectory.value / "src" / "test" / "scala" / "NumbersTest.scala"