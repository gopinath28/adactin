package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class Pom5 {
	public Pom5() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(id="logout")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	

}
