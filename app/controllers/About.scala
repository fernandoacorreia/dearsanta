package controllers

import play.api._
import play.api.mvc._

object About extends Controller {

  def credits = Action {
    Ok(views.html.credits())
  }

}