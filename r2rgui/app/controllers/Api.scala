package controllers

import play.api.mvc.{Action, Controller}
import models.{Executor, FilePaths}
import java.nio.file.{StandardCopyOption, Paths, Files}
import play.api.Logger
import java.io.{FileWriter, File}

object Api extends Controller {

  val log = Logger(getClass)

  def sparqlInput(endpointUri: String, inputGraph: String, sparqlPattern: String) = Action { implicit request => {
    //Import from SPARQL endpoint
    Executor.importSparql(endpointUri, inputGraph, sparqlPattern)
    log.info("Loading from store finished" + inputGraph)

    //Redirect to main page
    Redirect("/")
  }}

  def fileInput = Action { implicit request => {
    for(data <- request.body.asMultipartFormData;
        file <- data.files) {
      if(!file.filename.matches("^.*\\.ttl$")){
        Files.copy(file.ref.file.toPath, Paths.get(FilePaths.inputFile), StandardCopyOption.REPLACE_EXISTING)
        log.info("Updated input file")
      }
      else log.info("It's ttl! Did not update input file")
    }
    Ok
  }}

  def mapping = Action { implicit request => {
    // Handle cases when the mapping is attached as file
    for(data <- request.body.asMultipartFormData;
        file <- data.files) {
      Files.copy(file.ref.file.toPath, Paths.get(FilePaths.mappingFile), StandardCopyOption.REPLACE_EXISTING)
      log.info("Updated mapping file")
    }

    //Handle cases when the mapping is contained in the body
    for(data <- request.body.asText if !data.isEmpty) {
      val out = new FileWriter(FilePaths.mappingFile)
      out.write(data)
      out.close()
      log.info("Updated mapping file")
    }

    Ok
  }}

  def executeToSparql(endpointUri: String) = Action {
    log.info("Execution started")
    Executor.execute(endpointUri)
    log.info("Execution finished")
    //Redirect to main page
    Redirect("/")
  }

  def executeToFile() = Action {
    new File(FilePaths.outputFile).createNewFile()
    log.info("Execution started")
    Executor.execute("")
    log.info("Execution finished")
    //Return output file
    Ok.sendFile(new File(FilePaths.outputFile), false)
  }
}
