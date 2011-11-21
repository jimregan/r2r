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
package de.fuberlin.wiwiss.r2r;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * This implementation of the Output interface serializes the target dataset in RDF/XML format. The target dataset is build in-memory and is not written until the close() method is called. 
 * @author andreas
 *
 */
public class RDFXMLOutput implements Output {
	private final OutputStream outputStream;
	private final Writer writer;
	private final Model outputModel;
	
	public RDFXMLOutput(String file) throws IOException {
		super();
		writer = new BufferedWriter(new FileWriter(file));
		outputStream = null;
		outputModel = ModelFactory.createDefaultModel();
	}
	
	public RDFXMLOutput(OutputStream output) {
		super();
		writer = null;
		outputStream = output;
		outputModel = ModelFactory.createDefaultModel();
	}
	
	public RDFXMLOutput(Writer writer) {
		super();
		this.writer = writer;
		outputStream = null;
		outputModel = ModelFactory.createDefaultModel();
	}
	
	/**
	 * writes the in-memory model and closes the output stream or writer.
	 */
	public void close() throws IOException {
		if(writer!=null) {
			outputModel.write(writer, "RDF/XML");
			writer.flush();
			writer.close();
		}
		if(outputStream!=null) {
			outputModel.write(outputStream, "RDF/XML");
			outputStream.flush();
			outputStream.close();
		}
	}

	public Model getOutputModel() {
		return ModelFactory.createDefaultModel();
	}

	public void write(Model output) {
		outputModel.add(output);
	}

}
