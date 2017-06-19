package com.perennial.pageObject;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInToGmail {
	
	private static WebDriver driver = null;

	/*public static void main(String[] args) throws InterruptedException {*/
		@BeforeMethod
		public void initiate(){	
			final File file = new File(
				"chromedriver");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			/*	driver = new ChromeDriver(DesiredCapabilities.chrome());*/
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");

			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
			String Gurl = "https://accounts.google.com/signin";
			driver.get(Gurl);
		}
		@Test
		public void initiateTest(){
			GmailSignInPage.user_name(driver).click();
			GmailSignInPage.user_name(driver).clear();
			GmailSignInPage.user_name(driver).sendKeys(
				"developer2@perennialsys.com");
	
			GmailSignInPage.next_Button(driver).click();
		
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")));
			GmailSignInPage.password_Field(driver).click();
	
			GmailSignInPage.password_Field(driver).clear();
		
			GmailSignInPage.password_Field(driver).sendKeys("developer@321");
			//driver.wait(1000);	
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
			System.out.println("test case pass1");
		
			GmailSignInPage.next_Button(driver).click();
			String name = driver.getTitle();
			System.out.println(name);
			/*WebDriverWait wait1 = new WebDriverWait(driver, 40);
			wait1.until(ExpectedConditions.elementToBeClickable(By.className("WaidBe")));
			WebDriverWait wait2 = new WebDriverWait(driver, 40);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("#gbq1 > div > a > span")));*/
		}
		@AfterMethod
		public void terminate(){
			driver.close();
			driver.quit();
		}
	}
/*}*/
