Gasp Web UI
======

This is a trivial play framework app for data entry for the Gasp server. It is written in Play2 and Scala.

Read more about the <a href="http://mobilepaas.github.io">gasp-demo here</a>.

gasp-web 
      ----> gasp-server

This is deployed to CloudBees PaaS via: 

* Modify Build.scala for the appId you want to use
* Set the gasp-server endpoint in Application.scala
* Deploy via: `play cloudbees-deploy`


