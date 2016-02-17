package org.xtext.example.browser.interpreter.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.xtext.example.browser.browser.WebBrowser;
import org.xtext.example.browser.interpreter.Interpreter;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class BrowserInterpreterLauncher extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public BrowserInterpreterLauncher() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		XtextEditor editor = (XtextEditor) window.getActivePage().getActiveEditor();
		editor.getDocument().readOnly(
		  new IUnitOfWork<String, XtextResource>(){
		  @Override
		  public String exec(XtextResource xr) throws Exception {
			  
			  
			  
			  EObject e = xr.getContents().get(0);
			  
			  if(e instanceof WebBrowser) {
				  WebBrowser webBrowser = (WebBrowser) e;
				  new Interpreter().execute(webBrowser);
			  }	  
		    //xr.getAllContents();	    

		    return null;
		  }
		});
		
		
		return null;
	}
}
