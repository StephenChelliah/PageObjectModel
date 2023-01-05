package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class updateprofileobjects {
	
	@FindBy(xpath="//i[@class='la la-user mr-2 text-color-2']")
	public static WebElement myprofile;
	
	@FindBy(xpath="//input[@name='phone']")
	public static WebElement phonenumber;
	
	@FindBy(xpath="//input[@name='city']")
	public static WebElement city;
	
	@FindBy(xpath="//button[@id='cookie_stop']")
	public static WebElement Gotit;
	
	@FindBy(xpath="//button[@class='theme-btn waves-effect']")
	public static WebElement submit;
	
	
	/*	
 public static WebElement myprofile(WebDriver driver)
	{
	return driver.findElement(By.xpath("//i[@class='la la-user mr-2 text-color-2']"));
	
	}
	//public static WebElement phonenumber(WebDriver driver)
	//{
		//return driver.findElement(By.xpath("//input[@name='phone']"));
	//}
	
	//public static WebElement city(WebDriver driver)
	//{
		//return driver.findElement(By.xpath("//input[@name='city']"));
	//}
	
	public static WebElement Gotit(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[@id='cookie_stop']"));
	}
	
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[@class='theme-btn waves-effect']"));
	}
	
	
	
	*/

}
