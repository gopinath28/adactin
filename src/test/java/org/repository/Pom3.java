package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class Pom3 {
	public Pom3() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	@FindBy(id="continue")
	private WebElement continues;
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getContinues() {
		return continues;
	}
	

}






