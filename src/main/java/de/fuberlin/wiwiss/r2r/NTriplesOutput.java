package de.fuberlin.wiwiss.r2r;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * This implementation of the Output interface serializes the target dataset in N-Triples format. The mapped output is written immediately.
 * @author andreas
 *
 */
public class NTriplesOutput implements Output {
	private final OutputStream outputStream;
	private final Writer writer;
	
	public NTriplesOutput(String filename) throws IOException {
		super();
		writer = new BufferedWriter(new FileWriter(filename));
		outputStream = null;
	}
	
	public NTriplesOutput(OutputStream output) {
		super();
		writer = null;
		outputStream = output;
	}
	
	public NTriplesOutput(Writer writer) {
		super();
		this.writer = writer;
		outputStream = null;
	}
	
	public void close() throws IOException {
		if(writer!=null) {
			writer.flush();
			writer.close();
		}
		if(outputStream!=null) {
			outputStream.flush();
			writer.close();
		}
	}

	public Model getOutputModel() {
		return ModelFactory.createDefaultModel();
	}

	public void write(Model output) {
		if(writer!=null)
			output.write(writer, "N-TRIPLE");
		else
			output.write(outputStream, "N-TRIPLE");
	}
}
