package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import views._


import play.api.Play.current
 

object Application extends Controller {

  /**
   * Describes the hello form.
   */
  val helloForm = Form(
    tuple(
      "name" -> nonEmptyText,
      "website" -> nonEmptyText,
      "address" -> nonEmptyText
    )
  )

  val result = false

  // -- Actions

  /**
   * Home page
   */
  def index = Action { implicit request =>
    Ok(html.index(helloForm))  
  }

  /**
   * Handles the form submission.
   */
  def createRestaurant = Action { implicit request =>

  helloForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.index(formWithErrors)),
      {case (name, website, address) => 
        storeEntry(name=name, website=website, address=address)
        Ok(html.hello(name))}
    )
  }


  def storeEntry(name: String, website: String, address: String) = {
    import play.api.libs.json._
    import play.api.libs.ws._
    var payload = Json.toJson(Map("name" -> name, "website" -> website, "address" -> address))
    WS.url("http://gasp.partnerdemo.cloudbees.net/restaurants")        
        .post(payload)
 }


  
 
 
  
  
  
}
