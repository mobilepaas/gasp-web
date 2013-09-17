import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "gasp-web"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm
  )



  import cloudbees.Plugin._
  val main = play.Project(appName, appVersion, appDependencies) 
    .settings(cloudBeesSettings :_*)
    .settings(CloudBees.applicationId := Some("michaelnealeclickstart2/gasp-web"))
}
