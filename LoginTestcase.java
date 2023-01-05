package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.Loginpageobjects;

public class LoginTestcase {
	
	  @Test
      public void testcase() throws InterruptedException
      {
    	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	  ChromeDriver driver=new ChromeDriver();
    	  driver.get("https://phptravels.net/login");
    	  Thread.sleep(3000);
    	  
    	  PageFactory.initElements(driver, Loginpageobjects.class);
    	  
    	  Loginpageobjects.Email.sendKeys("user@phptravels.com");
    	  Loginpageobjects.password.sendKeys("demouser");
    	  Loginpageobjects.Login.click();
    	  
    	  
    	  
    	  
    	  /*
    	  Loginpageobjects.Email(driver).sendKeys("user@phptravels.com");
    	  Loginpageobjects.password(driver).sendKeys("demouser");
          Loginpageobjects.Login(driver).click();
    	  
    	  
   */
      
      
      
      }
  
	

}
