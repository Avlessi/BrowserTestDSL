/*
 * generated by Xtext
 */
package org.xtext.example.browser.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractBrowserValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.example.browser.browser.BrowserPackage.eINSTANCE);
		return result;
	}
}
