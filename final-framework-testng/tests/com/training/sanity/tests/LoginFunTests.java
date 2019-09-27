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
import com.training.pom.LoginFunPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class LoginFunTests {
	private WebDriver driver;
	private String baseUrl;
	private LoginFunPOM LoginFunPOM;
	
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
		LoginFunPOM =new LoginFunPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		LoginFunPOM.clickMyAccount();
		LoginFunPOM.clickLogin();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
		
	}
	@Test
	public void validLoginFunTest() {
		LoginFunPOM.sendemailAddr("saranyamadikiri@gmail.com");
		LoginFunPOM.sendpssword("sara1234");
		LoginFunPOM.clickLoginbutton();
		 
		screenShot.captureScreenShot("Second");
	}

}
