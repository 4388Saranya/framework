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

import com.training.pom.RegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegisterTests {
	private WebDriver driver;
	private String baseUrl;
	private RegisterPOM registerPOM;
	
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);

	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		registerPOM = new RegisterPOM(driver); 
		baseUrl=properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		
		registerPOM.clickMyAccount();
		registerPOM.clickRegister();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validRegisterTest() {
		registerPOM.sendfirstName("saranya");
		registerPOM.sendlastName("Madikiri");
		registerPOM.sendeMail("saranyachampe5@gmail.com");
		registerPOM.sendtelePhone("8985664603");
		registerPOM.sendaddress1("Marathalli");
		registerPOM.sendcity("Bangalor");
		registerPOM.sendpostCode("560037");
		registerPOM.selectCountry();
		registerPOM.selectState();
		registerPOM.sendpassword("sara123");
		registerPOM.sendconfirmpass("sara123");
		registerPOM.clickagreechecked();
		registerPOM.clicksubmitcontin();
		 
		screenShot.captureScreenShot("First");
	}

}
