package models

import java.io.File

object FilePaths {

  init()

  def dataDir = "data/"

  def inputDir = dataDir + "source/"

  def inputFile = inputDir + "input.nq"

  def mappingDir = dataDir + "mapping/"

  def mappingFile = mappingDir + "mapping.ttl"

  def outputDir = dataDir + "output/"

  def outputFile = outputDir + "output.nq"

  private def init() {
    new File(dataDir).mkdirs()
    new File(inputDir).mkdirs()
    new File(mappingDir).mkdirs()
    new File(outputDir).mkdirs()
  }
}
