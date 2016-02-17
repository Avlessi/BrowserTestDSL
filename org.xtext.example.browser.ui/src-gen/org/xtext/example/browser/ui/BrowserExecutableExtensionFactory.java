/*
 * generated by Xtext
 */
package org.xtext.example.browser.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.browser.ui.internal.BrowserActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BrowserExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return BrowserActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return BrowserActivator.getInstance().getInjector(BrowserActivator.ORG_XTEXT_EXAMPLE_BROWSER_BROWSER);
	}
	
}
