package controllers

import play.api._
import play.api.mvc._
import org.slf4j.LoggerFactory
import models.{FilePaths, Executor}
import java.io.File

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }
}