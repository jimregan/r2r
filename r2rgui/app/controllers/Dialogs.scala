package controllers

import play.api.mvc.{Action, Controller}

object Dialogs extends Controller {

  def sparqlInputDialog = Action {
    Ok(views.html.sparqlInputDialog())
  }

  def fileInputDialog = Action {
    Ok(views.html.fileDialog("api/fileInput", "Supported formats are N-Quads and N-Triples!"))
  }

  def mappingDialog = Action {
    Ok(views.html.fileDialog("api/mapping", "Please select a Turtle mapping file!"))
  }

  def sparqlOutputDialog = Action {
    Ok(views.html.sparqlOutputDialog())
  }
}
