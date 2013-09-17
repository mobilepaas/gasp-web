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
      {case (name, repeat, color) => Ok(html.hello(name))}
    )
  }
  
 
 
  
  
  
}
