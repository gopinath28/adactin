package org.resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.stepdefinition.Hooks;

public class BaseClass {
	public static void url(String s) {
		Hooks.driver.get(s);	
	}
	
	public static void type(WebElement w,String s) {
		w.sendKeys(s);
	}
	
	public static void click(WebElement w) {
		w.click();
	}
	
	public static void selecting(WebElement w,String s1) {
	Select s=new Select(w);
	s.selectByVisibleText(s1);
	}
	

}
