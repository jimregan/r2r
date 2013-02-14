package models

import java.io._
import java.util.Properties
import ldif.config.{COMPLETE, OutputConfig, IntegrationConfig, SchedulerConfig}
import xml.{XML, Elem}
import java.util.logging.Logger
import ldif.util._
import ldif.local.{IntegrationJob, Scheduler}
import org.apache.commons.io.FileUtils
import ldif.local.scheduler.{SparqlConfig, SparqlImportJob}
import java.net.URI
import ldif.local.scheduler.SparqlConfig
import ldif.local.scheduler.SparqlConfig
import ldif.output.{SparqlWriter, NQUADS, SerializingQuadWriter, RDFSyntax}

object Executor {

  private val integrationProperties = new Properties()
  integrationProperties.load(new StringReader(
    """discardFaultyQuads=true
       validateSources=false
       rewriteURIs=true
       uriMinting=true
       uriMintNamespace=http://new.dbpedia.org/resource/
       uriMintLabelPredicate=http://www.w3.org/2000/01/rdf-schema#label
       uriMintLanguageRestriction=en fr es
       #entityBuilderType=quad-store
       outputQualityScores=false
       qualityFromProvenanceOnly=false
       runStatusMonitor=false
       #output=fused-only"""
  ))

  def importSparql(endpointUri: String, inputGraph: String, sparqlPattern: String) {
    val sparqlConfig = SparqlConfig(new URI(endpointUri), new URI(inputGraph), Seq(sparqlPattern))
    val importJob = SparqlImportJob(sparqlConfig, Identifier.random, "onStartup", "DataSource")

    importJob.load(new FileOutputStream(FilePaths.inputFile))
  }

  def execute(endpointUri: String) {
    val fileOutput = new SerializingQuadWriter(FilePaths.outputFile, NQUADS)
    val sparqlOutput = new SparqlWriter(endpointUri)
    val outputs = (Some(fileOutput), COMPLETE) :: Nil

    val config = IntegrationConfig(sources = Seq(FilePaths.inputDir),
                                   linkSpecDir = null,
                                   mappingDir = new File(FilePaths.mappingDir),
                                   sieveSpecDir = null,
                                   outputs = new OutputConfig(outputs),
                                   properties = integrationProperties,
                                   runSchedule = "onStartup")

    val integrator = IntegrationJob(config, debugMode = false)
    integrator.runIntegration
  }
}
