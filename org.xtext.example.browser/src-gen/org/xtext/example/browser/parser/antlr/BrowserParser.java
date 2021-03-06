/*
 * generated by Xtext
 */
package org.xtext.example.browser.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.browser.services.BrowserGrammarAccess;

public class BrowserParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private BrowserGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.browser.parser.antlr.internal.InternalBrowserParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.browser.parser.antlr.internal.InternalBrowserParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "WebBrowser";
	}
	
	public BrowserGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BrowserGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
