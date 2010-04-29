package de.fuberlin.wiwiss.r2r;

import java.io.IOException;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * Implementation of the Output interface which writes to a Jena Model.
 * @author andreas
 *
 */
public class JenaModelOutput implements Output {
	private final Model model;
	
	public JenaModelOutput(Model model) {
		this.model = model; 
	}
	
	public void close() throws IOException {
		model.close();
	}

	public Model getOutputModel() {
		return ModelFactory.createDefaultModel();
	}

	public void write(Model output) {
		model.add(output);
	}
}
