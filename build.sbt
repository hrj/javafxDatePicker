import AssemblyKeys._ // put this at the top of the file

assemblySettings

name := "javafx-datepicker"

version := "0.0.2"

autoScalaLibrary := false

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/jfxrt.jar"))

excludedJars in assembly <<= (fullClasspath in assembly) map { cp => 
    cp filter {_.data.getName == "jfxrt.jar"}
}

