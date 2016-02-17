package org.xtext.example.browser.interpreter;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.xtext.example.browser.browser.Button;
import org.xtext.example.browser.browser.CheckBox;
import org.xtext.example.browser.browser.Collections;
import org.xtext.example.browser.browser.Condition;
import org.xtext.example.browser.browser.Function;
import org.xtext.example.browser.browser.Instructions;
import org.xtext.example.browser.browser.Link;
import org.xtext.example.browser.browser.Loop;
import org.xtext.example.browser.browser.Memorise;
import org.xtext.example.browser.browser.Onglet;
import org.xtext.example.browser.browser.Procedure;
import org.xtext.example.browser.browser.ProcedureLaunch;
import org.xtext.example.browser.browser.TextField;
import org.xtext.example.browser.browser.Variable;
import org.xtext.example.browser.browser.WebBrowser;
import org.xtext.example.browser.browser.WebPageObj;

public class Interpreter {

	Map<String, Object> environment = new HashMap<String, Object>();
	WebDriver webDriver;	

	public void execute(WebBrowser w) {

		System.out.println("WebBrowser execution");
		System.out.println("===================");
		System.out.println(w.getName());
		
		if(w.getName().equals("firefox")) {		
			webDriver = new FirefoxDriver();		
		}		
			
		for(Onglet onglet : w.getOnglets()) {
			System.out.println("onglet");
			this.step(onglet);
		}		
		
	}
	
	private void step(Onglet o) {
		System.out.println("step Onglet");
		System.out.println("open url = " + o.getUrl());		
		webDriver.get(o.getUrl());		
		
		for(Instructions ins : o.getIns()) {			
			this.step(ins);
		}
	}
	
	private void step(Instructions ins) {		
		if(ins.getFunc() != null) {
			System.out.println("function");			
			step(ins.getFunc());
		}		
		else if(ins instanceof Loop) {			
			System.out.println("loop");
			step(ins.getLoop());
		}
		else if(ins instanceof Condition) {
			System.out.println("condition");
			step(ins.getIfCond());
		}
		else if(ins instanceof Collections) {
			System.out.println("collections");
			step(ins.getColl());
		}
		else if(ins instanceof Memorise) {
			System.out.println("memorise");
			step(ins.getMem());
		}
		else if(ins instanceof Procedure) {
			System.out.println("procedure");
			step(ins.getProcs());
		}
		else if(ins instanceof ProcedureLaunch){
			System.out.println("procedureLaunch");
			step(ins.getL());
		}
		else if(ins instanceof Variable) {
			System.out.println("variable");
			step(ins.getV());
		}
	}
	
	private void step(Function f) {
		if(f.getCi() != null) {
			System.out.println("checkIf");
			
		}
		else if(f.getCl() != null) {
			System.out.println("clear");
			//TextField
			TextField t = f.getCl().getT();			
			WebElement elem = webDriver.findElement(By.id(t.getUsername()));
			elem.clear();
		}
		else if(f.getCob() != null) {
			System.out.println("clickOn");			
			//Button
			Button b = f.getCob().getButton();
			WebElement elem = webDriver.findElement(By.id(b.getButton()));
			elem.click();
		}
		else if(f.getFtf() != null) {
			String input = f.getFtf().getInput();
			System.out.println("fill");
			//TextField
			TextField t = f.getFtf().getTf();
			WebElement elem = webDriver.findElement(By.id(t.getUsername()));
			elem.sendKeys(input);
		}
		else if(f.getGtl() != null) {			
			System.out.println("gotoLink");
			if(f.getGtl().getLink() != null) {				
				webDriver.navigate().to(f.getGtl().getLink().getLink());
			}
			else if(f.getGtl().getV() != null) {
				WebPageObj o = f.getGtl().getV().getO();
				Link l = (Link)o;
				webDriver.navigate().to(l.getLink());
			}
		}
		else if(f.getSel() != null) {
			System.out.println("select");			
			//Checkbox
			CheckBox cb = f.getSel().getSb();
			WebElement elem = webDriver.findElement(By.id(cb.getCheckBox()));
			elem.click();
		}
	}
	
	private void step(Loop l) {
		
	}
	
	private void step(Collections coll) {
		
	}
	
	private void step(Variable v) {
		
	}
	
	private void step(Condition cond) {
		
	}
	
	private void step(Memorise mem) {
		
	}
	
	private void step(Procedure p) {
		
	}
	
	private void step(ProcedureLaunch l) {
		
	}
}
