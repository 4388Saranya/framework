package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.DenyOnInvalidCrePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class DenyOnInvalidCreTests {
	private WebDriver driver;
	private String baseUrl;
	private DenyOnInvalidCrePOM DenyOnInvalidCrePOM;
	
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		DenyOnInvalidCrePOM =new DenyOnInvalidCrePOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		DenyOnInvalidCrePOM.clickMyAccount();
		DenyOnInvalidCrePOM.clickLogin();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginFunTest() {
		DenyOnInvalidCrePOM.sendemailAddr("saranyamadikiri@gmail.com");
		DenyOnInvalidCrePOM.sendpssword("sara12");//given invalid password
		DenyOnInvalidCrePOM.clickLoginbutton();
		 
		screenShot.captureScreenShot("Fourth");
		DenyOnInvalidCrePOM.sendemailAddr("saranyamadikii@gmail.com");
		DenyOnInvalidCrePOM.sendpssword("sara123");//given invalid email id
		DenyOnInvalidCrePOM.clickLoginbutton();
		 
		screenShot.captureScreenShot("Fourth1");
	}
}
