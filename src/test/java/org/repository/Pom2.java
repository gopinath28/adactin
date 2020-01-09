package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class Pom2 {
	public Pom2() {
		PageFactory.initElements(Hooks.driver,this );	
	}
	@FindBy(id="room_type")
	private WebElement roomtype;
	public WebElement getRoomtype() {
		return roomtype;
	}
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hotels;
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(id="room_nos")
	private WebElement roomnos;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="child_room")
	private WebElement child;
	@FindBy(id="Submit")
	private WebElement submit;

}
