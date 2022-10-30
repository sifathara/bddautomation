package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpageobjectmodel {
   public WebDriver driver;
   By Username=By.id("email");
   By password=By.id("pass");
   By login=By.id("login");
   public loginpageobjectmodel(WebDriver driver)
   {
	this.driver=driver;
   }
public void Fb_username() {
	driver.findElement(Username).sendKeys("ifathara");
}
public void Fb_password() {
	driver.findElement(password).sendKeys("8074503018");
}
public void Fb_login() {
	driver.findElement(login).click();
}
	
	
}

