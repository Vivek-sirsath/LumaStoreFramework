package com.lumastore.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.lumastore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	
	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();
	String email = readConfig.getEmail();
	String password = readConfig.getPassword();
	
	public static WebDriver driver; 
	public static Logger logger;
	
	@BeforeClass
	public void setup() {    // Setup to launch browser
		
				switch(browser.toLowerCase())
				{
				case "chrome":
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					break;

				case "msedge":
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					break;

				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					break;
				default:
					driver = null;
					break;

				}
		
		// Maximize browser window
		driver.manage().window().maximize();
		
		// It is good practice to use implicite wait after maximizing the window.
		// Give wait for synchronization
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		// For logging
		logger = LogManager.getLogger(BaseClass.class);
				
		//open url
		driver.get(url);
		logger.info("url opened");
	}
	
	public void captureScreenShot(WebDriver driver, String testName) throws IOException  {
		
		// Step1: Convert webdriver object to TakeScreenshot Interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);  // Type cast
		
		// Step2: Call getScreenshotAs method to create image file
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
		
		// Step3: Copy Image File to Destination
		FileUtils.copyFile(src, dest);
	}
	
		
	@AfterClass (enabled = true)
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
