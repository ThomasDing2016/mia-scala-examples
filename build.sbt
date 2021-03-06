import AssemblyKeys._

seq(assemblySettings: _*)

test in assembly := {}

mergeStrategy in assembly := {
  case "META-INF/MANIFEST.MF" => MergeStrategy.discard
  case "hadoop-core-1.2.1.jar" => MergeStrategy.discard
  case _ => MergeStrategy.first
}

fork in Test := true

javaOptions += "-Xmx2G"

name := "mia-scala-examples"

EclipseKeys.withSource := true

version := "1.0"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "org.apache.hadoop" % "hadoop-core" % "1.2.1",
  "org.apache.mahout" % "mahout-core" % "0.8",
  "nz.ac.waikato.cms.weka" % "weka-dev" % "3.7.6",
  "de.bwaldvogel" % "liblinear" % "1.92",
  "org.apache.lucene" % "lucene-core" % "4.2.1",
  "org.apache.lucene" % "lucene-analyzers-common" % "4.2.1",
  "org.apache.lucene" % "lucene-queries" % "4.2.1",
  "org.apache.lucene" % "lucene-queryparser" % "4.2.1",
  "org.apache.tika" % "tika-core" % "1.4",
  "org.apache.tika" % "tika-parsers" % "1.4",
  "org.apache.opennlp" % "opennlp-maxent" % "3.0.3",
  "org.apache.opennlp" % "opennlp-tools" % "1.5.3",
  "com.novocode" % "junit-interface" % "0.10" % "test"
)
