package de.fuberlin.wiwiss.r2r.discovery;

import java.util.Map;
import java.util.Collection;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;



import de.fuberlin.wiwiss.r2r.parser.*;

public class DiscoveryTargetVocabulary {
	// "Map<term, dataset>"
	private final Map<String, String> terms;
	
	public DiscoveryTargetVocabulary(Map<String, String> vocabularyTerms, String dataset) {
		this.terms = vocabularyTerms;
		if(dataset!=null)
			setDataset(dataset);
	}
	
	private void setDataset(String dataset) {
		for(Map.Entry<String, String> termDataset: terms.entrySet()) {
			if(termDataset.getValue()==null)
				termDataset.setValue(dataset);
		}
	}

	public Map<String, String> getTermDatasetPairs() {
		return terms;
	}
	
	public static Collection<DiscoveryTargetVocabulary> parse(String vocabDefinition) {
		CharStream stream =	new ANTLRStringStream(vocabDefinition);
		TargetVocabularyDiscoveryLexer lexer = new TargetVocabularyDiscoveryLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		TargetVocabularyDiscoveryParser parser = new TargetVocabularyDiscoveryParser(tokenStream);
		Collection<DiscoveryTargetVocabulary> tvs = null;
		try {
			tvs = parser.targetVocabulary();
		} catch (RecognitionException e) {
			System.err.println(e.getMessage());
			return null;
		}
		return tvs;
	}
	
}
