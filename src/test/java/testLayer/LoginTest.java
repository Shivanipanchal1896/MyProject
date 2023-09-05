package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseHRMClass;
import pompackage.PomLogin;

public class LoginTest extends BaseHRMClass {
	PomLogin Log;
	public LoginTest(){		
		super();
	}
   @BeforeMethod
   public void initsetup() {
	   initiate();
	   screenshots("Login");
	    Log=new PomLogin();
   }  
	
	  @Test(priority =1) public void Title() { 
		  String actual= Log.verify();
		  System.out.println(actual); Assert.assertEquals(actual,"Test Login | Practice Test Automation"); 
		  }
	 	
	 // @DataProvider 
	  //public Object[][] Details(){ 
	//Object result[][]=ExcelSheet.readdata("Sheet1"); 
	//return result; }
	 
	 @Test(priority =2)//, dataProvider="Details") 
	  public void Login(){
	  Log.typeusername(prop.getProperty("username"));
	  Log.typepassword(prop.getProperty("password")); 
	  Log.clickbtn(); 
	  }
		 
  @AfterMethod 
	  public void close(){ 
	driver.close();
	  }
}
