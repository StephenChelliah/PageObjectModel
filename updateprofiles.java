package testcases;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.Loginpageobjects;
import pageobjects.updateprofileobjects;
  

public class updateprofiles {
	
	@Test
	  public void updateprofile() throws InterruptedException 
	      {
	    	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    	  ChromeDriver driver=new ChromeDriver();
	    	  driver.get("https://phptravels.net");
	    	  Thread.sleep(3000);
	    	  
	    	  PageFactory.initElements(driver, Loginpageobjects.class);
	    	  
	    	  Loginpageobjects.Email.sendKeys("user@phptravels.com");
	    	  Loginpageobjects.password.sendKeys("demouser");
	    	  Loginpageobjects.Login.click();
	    	  Thread.sleep(10000);
	    	  updateprofileobjects.myprofile.click();
	          driver.manage().window().maximize();
	          
	         // For scrolling down
	          JavascriptExecutor jse= (JavascriptExecutor) driver;
	          jse.executeScript("window.scrollBy(0,10000)");
	          Thread.sleep(3000);
	          
	          updateprofileobjects.submit.click();
	     
	      }
}
	    	  
	    	  
	    	 
	    	  
	    	 /* Loginpageobjects.Email(driver).sendKeys("user@phptravels.com");
	    	  Loginpageobjects.password(driver).sendKeys("demouser");
	          Loginpageobjects.Login(driver).click();
	          Thread.sleep(10000);
	          
	          updateprofileobjects.myprofile(driver).click();
	          driver.manage().window().maximize();
	          
	         //updateprofileobjects.phonenumber(driver).sendKeys("1234")
	        		  
	         // updateprofileobjects.city(driver).sendKeys("London");
	          Thread.sleep(20000);
	         // Alert altobj=driver.switchTo().alert();
	          //altobj.accept();
	          updateprofileobjects.Gotit(driver).click();
	          Thread.sleep(10000);
	          
	          //For scrolling down
	          JavascriptExecutor jse= (JavascriptExecutor) driver;
	          jse.executeScript("window.scrollBy(0,10000)");
	          Thread.sleep(3000);
	          
	          updateprofileobjects.submit(driver).click();
	     
	          
*/      
	      
