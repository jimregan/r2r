/*
 *  R2R
 *
 *  Copyright 2010-2011 Freie Universität Berlin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package de.fuberlin.wiwiss.r2r.examples;

import de.fuberlin.wiwiss.r2r.*;

public class Example4 {

	public static void main(String[] args) throws Exception {
		// Configure the source, use local file
		Source in = new FileOrURISource("example_data/example4_data.nt");
		
		// Output to local file in RDF/XML format
//		Output out = new RDFXMLOutput("example2_output.xml");
		Output out = new NTriplesOutput("example4_output.nt");

		/*
		 *  Create an in-memory repository from a local file, but use import function
		 *  to convert OWL and RDFS to R2R mappings.
		 *  The URI generator is used to assign URIs to the generated mappings.
		 */
		Repository mappingRepository = Repository.createJenaModelRepository(
				Repository.importMappingDataFromFile(
						"example_data/mappings.ttl", 
						new EnumeratingURIGenerator("http://nodomain/convertedMapping")));
		
		// Specify target dataset. Just generate any statement containing on of the properties
		String vocabulary = "@prefix foaf: <http://xmlns.com/foaf/0.1/> ." +
				"@prefix dbpedia: <http://dbpedia.org/ontology/> ." +
				"@prefix v: <http://www.w3.org/2006/vcard/ns#> ." +
				"@prefix foaf: <http://xmlns.com/foaf/0.1/> ." +
		"(" +
			"dbpedia:starring," +
			"dbpedia:director" +
		")";
		
		// Transform: The output data is written to LabelToName_Output.nt
		Mapper.transform(in, out, mappingRepository, vocabulary);
		
		// Close the Output object to write the data to file
		out.close();
		System.out.println("Finished.");
	}
}
