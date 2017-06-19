package com.perennial.pageObject;
import org.openqa.selenium.*;


public class GmailSignInPage {
	
	private static WebElement element = null;
	
	public static WebElement user_name(WebDriver driver){
		element = driver.findElement(By.id("identifierId"));
	      return element;
	}
	public static WebElement next_Button(WebDriver driver){
		element = driver.findElement(By.className("CwaK9"));
	      return element;
	}
	public static WebElement password_Field(WebDriver driver){
		element = driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
		
	      return element;
	}
	
	public static WebElement password_Page_Next_Button(WebDriver driver){
		element = driver.findElement(By.linkText("Next"));
	      return element;
	}
	public static WebElement Myaccount_Gmail_Logo(WebDriver driver){
		element = driver.findElement(By.className("WaidBe"));
	      return element;
	}
	
	public static WebElement Myaccount_Gmail_Compose(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div"));
	      return element;
	}
	
	
	public static WebElement Myaccount_Gmail_TO(WebDriver driver){
		element = driver.findElement(By.name("to"));
	      return element;
	}
	
	
	public static WebElement Myaccount_Gmail_Sub(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\":3rh\"]"));
	      return element;
	}
	
	public static WebElement Myaccount_Gmail_Context(WebDriver driver){
		element = driver.findElement(By.className("Am Al editable LW-avf"));
	      return element;
	}
	
	public static WebElement Myaccount_Gmail_Context_Send(WebDriver driver){
		element = driver.findElement(By.className("T-I J-J5-Ji aoO T-I-atl L3"));
	      return element;
	}
}
