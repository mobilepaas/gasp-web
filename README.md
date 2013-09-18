Gasp Web UI
======

This is a trivial play framework app for data entry for the Gasp server. It is written in Play2 and Scala.

> <img src="http://www.cloudbees.com/sites/all/themes/custom/cloudbees_zen/css/bidesign/_ui/images/logo.png"/>
>
> <b>Note</b>: <i>This repo is part of the Gasp demo project - a showcase of <a href="https://developer.cloudbees.com/bin/view/Mobile">cloudbees mobile services</a>.
> You can see the big picture of the <a href="http://mobilepaas.cloudbees.com">showcase here</a>.
> Feel free to fork and use this repo as a template.</i>

Read more about the <a href="http://mobilepaas.github.io">gasp-demo here</a>.

gasp-web 
      ----> gasp-server

This is deployed to CloudBees PaaS via: 

* Modify Build.scala for the appId you want to use
* Set the gasp-server endpoint in Application.scala
* Deploy via: `play cloudbees-deploy`


