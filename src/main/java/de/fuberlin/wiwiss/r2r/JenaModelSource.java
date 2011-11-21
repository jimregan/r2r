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

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;

/**
 * Implementation of the Source interface which wraps a Jena Model.
 * @author andreas
 *
 */
public class JenaModelSource implements Source {
	private Model model;

	/**
	 * 
	 * @param model The Jena Model
	 */
	public JenaModelSource(Model model) {
		this.model = model;
	}
	
	public QueryExecution executeQuery(String query) {
		return QueryExecutionFactory.create(query, model);
	}

	public Model executeDescribeQuery(String query) {
		QueryExecution qe = QueryExecutionFactory.create(query, model);
		Model model = qe.execDescribe();
		qe.close();
		return model;
	}

	public Model executeConstructQuery(String query) {
		QueryExecution qe = QueryExecutionFactory.create(query, model);
		Model model = qe.execConstruct();
		qe.close();
		return model;
	}
}
