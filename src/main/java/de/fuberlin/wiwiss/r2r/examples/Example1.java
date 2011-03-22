package de.fuberlin.wiwiss.r2r.examples;

import de.fuberlin.wiwiss.r2r.FileOrURISource;
import de.fuberlin.wiwiss.r2r.Mapper;
import de.fuberlin.wiwiss.r2r.NTriplesOutput;
import de.fuberlin.wiwiss.r2r.Output;
import de.fuberlin.wiwiss.r2r.Repository;
import de.fuberlin.wiwiss.r2r.Source;

public class Example1 {
	public static void main(String[] args) throws Exception {
		// Configure the source, use local file
		Source in = new FileOrURISource("example_data/example1_data.ttl");
		
		// Output to local file in RDF/XML format
//		Output out = new RDFXMLOutput("example2_output.xml");
		Output out = new NTriplesOutput("example1_output.nt");

		// Create an in-memory repository from a local file
		Repository mappingRepository = Repository.createFileOrUriRepository("example_data/mappings.ttl");
		
		// Specify target dataset. Just generate any statement containing one of the properties
		String vocabulary = "@prefix foaf: <http://xmlns.com/foaf/0.1/> ." +
				"@prefix dbpedia: <http://dbpedia.org/ontology/> ." +
				"@prefix v: <http://www.w3.org/2006/vcard/ns#> ." +
		"(" +
			"foaf:mbox," +
			"dbpedia:birthDay," +
			"v:n" +
		")";
		
		// Transform: The output data is written to LabelToName_Output.nt
		Mapper.transform(in, out, mappingRepository, vocabulary);
		
		// Close the Output object to write the data to file
		out.close();
		System.out.println("Finished.");
	}
}
