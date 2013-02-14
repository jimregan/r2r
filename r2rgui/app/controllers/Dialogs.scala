package controllers

import play.api.mvc.{Action, Controller}

object Dialogs extends Controller {

  def sparqlInputDialog = Action {
    Ok(views.html.sparqlInputDialog())
  }

  def fileInputDialog = Action {
    Ok(views.html.fileDialog("api/fileInput"))
  }

  def mappingDialog = Action {
    Ok(views.html.fileDialog("api/mapping"))
  }

  def sparqlOutputDialog = Action {
    Ok(views.html.sparqlOutputDialog())
  }
}
