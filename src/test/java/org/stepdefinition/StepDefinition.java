package org.stepdefinition;

import org.repository.Pom1;
import org.repository.Pom2;
import org.repository.Pom3;
import org.repository.Pom4;
import org.repository.Pom5;
import org.resources.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	Pom1 p1=new Pom1();
	Pom2 p2=new Pom2();
	Pom3 p3=new Pom3();
	Pom4 p4=new Pom4();
	Pom5 p5=new Pom5();
@Given("To enter the url and enter the username&password & login")
public void to_enter_the_url_and_enter_the_username_password_login() {
	
	url("https://adactin.com/HotelApp/index.php");
	type(p1.getUser(), "darkdevil");
	type(p1.getPass(), "happy@2020");
	click(p1.getLog());
  
}

@When("To search the hotel with your choice")
public void to_search_the_hotel_with_your_choice() {
	selecting(p2.getLoc(), "Sydney");
	selecting(p2.getHotels(), "Hotel Creek");
	selecting(p2.getRoomtype(), "Deluxe");
	selecting(p2.getRoomnos(), "1 - One");
	selecting(p2.getAdult(), "1 - One");
	selecting(p2.getChild(), "1 - One");
	
	
	click(p2.getSubmit());
   
}

@When("To select the hotle and click on continue")
public void to_select_the_hotle_and_click_on_continue() {
	click(p3.getRadiobutton());
	click(p3.getContinues());
	
 
}

@When("To Book the hotel with payments")
public void to_Book_the_hotel_with_payments() throws Exception {
	type(p4.getFirstname(), "gopi");
	type(p4.getLastname(), "palanisamy");
	type(p4.getAddress(), "sollamaten");
	type(p4.getCredit(), "1234567891011123");
	selecting(p4.getCardtype(), "VISA");
	selecting(p4.getExpirymonth(), "April");
	selecting(p4.getExpiryyear(), "2022");
	type(p4.getCvv(), "523");
	click(p4.getBooknow());
	Thread.sleep(5000);
}

@Then("To Logout from the Site")
public void to_Logout_from_the_Site() {
	click(p5.getLogout());
  
}

}
