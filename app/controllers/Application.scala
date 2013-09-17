package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._


object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

    val restaurantForm = Form(
        tuple(
          "name" -> nonEmptyText,
          "website" -> nonEmptyText,
          "address" -> nonEmptyText
      )
    )


  def createReview = Action { implicit request =>
    val (name, website, address) = restaurantForm.bindFromRequest.get
    println("CREATING " + name)
    Redirect(routes.Application.index)
  }

}





