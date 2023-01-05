package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpageobjects
{
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement Email;
	
	@FindBy(xpath="//input[@name='password']")
	public static WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement Login;
	
	
	
	
	/*
	public static WebElement Email(WebDriver driver)
	{
	    return driver.findElement(By.xpath("//input[@name='email']"));
	
	}
	
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	
    
	public static WebElement Login(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	
	
	*/

}
