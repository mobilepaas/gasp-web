Gasp Web 
======

This is a trivial play framework app that creates new data for the gasp demo app. 

gasp-web ----> pushes data into -----> gasp-server

This runs as an app on the CloudBees PaaS via: 

`play cloudbees-deploy`

(check out the Build.scala config for the appId it will be deployed to)