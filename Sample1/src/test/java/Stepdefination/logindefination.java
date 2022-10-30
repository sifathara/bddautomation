package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginpageobjectmodel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logindefination {
	WebDriver driver;
	loginpageobjectmodel login;
	
	
	
	@Given("browser to open")
	public void browser_to_open() {
	    
	WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();	
		
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
	}

	@When("hits login button")
	public void hits_login_button() {
	 
	login.Fb_login();		
			
			
			
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		throw new io.cucumber.java.PendingException();
		
		
	}



}
