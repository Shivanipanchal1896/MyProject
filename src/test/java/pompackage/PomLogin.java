package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseHRMClass;

public class PomLogin extends BaseHRMClass {
	
	
@FindBy(id="username") WebElement Username;
	  
@FindBy(id="password") WebElement Password;
	  
@FindBy(id="submit")
WebElement Login;
	 
   
   //initiate page elements
   public PomLogin() {
	   
	   PageFactory.initElements(driver, this);
   }
   public void typeusername(String name) {
	   
	   Username.sendKeys(name);
   }
   public void typepassword(String pass) {
	   Password.sendKeys(pass);
	 
   }
   public void clickbtn() {
	   Login.click();
   }
	
	public String verify() { 
	return driver.getTitle();
	  
	  }
	 
}



