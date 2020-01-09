package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class Pom4 {
	public Pom4(){
		PageFactory.initElements(Hooks.driver, this);
	}
@FindBy(id="first_name")
private WebElement firstname;
@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="address")
private WebElement address;
@FindBy(id="cc_num")
private WebElement credit;
@FindBy(id="cc_type")
private WebElement cardtype;
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCredit() {
	return credit;
}
public WebElement getCardtype() {
	return cardtype;
}
public WebElement getExpirymonth() {
	return expirymonth;
}
public WebElement getExpiryyear() {
	return expiryyear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBooknow() {
	return booknow;
}
@FindBy(id="cc_exp_month")
private WebElement expirymonth;
@FindBy(id="cc_exp_year")
private WebElement expiryyear;
@FindBy(id="cc_cvv")
private WebElement cvv;
@FindBy(id="book_now")
private WebElement booknow;

}







