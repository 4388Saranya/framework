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
import com.training.pom.CheckwithLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CheckwithLoginTests {
	private WebDriver driver;
	private String baseUrl;
	private CheckwithLoginPOM CheckwithLoginPOM;
	
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
		CheckwithLoginPOM =new CheckwithLoginPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		CheckwithLoginPOM.clickMyAccount();
		CheckwithLoginPOM.clickLogin();
		CheckwithLoginPOM.sendemailAddr("saranyamadikiri@gmail.com");
		CheckwithLoginPOM.sendpssword("sara1234");
		CheckwithLoginPOM.clickLoginbutton();
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginFunTest() {
		CheckwithLoginPOM.clickUniformStore();
		CheckwithLoginPOM.clickShopUniforms();
		CheckwithLoginPOM.clickRusTshirt();
		CheckwithLoginPOM.selectSize();
		CheckwithLoginPOM.clickAddtoCart();
		CheckwithLoginPOM.clickViewCartimage();
		CheckwithLoginPOM.clickViewCartbutton();
		CheckwithLoginPOM.clickCheckout();
		CheckwithLoginPOM.clickContiBillDet();
		CheckwithLoginPOM.clickContiDelDet();
		CheckwithLoginPOM.sendEnterComments("Please deliver between 7 am to 10 am");
		CheckwithLoginPOM.clickContiComments();
		CheckwithLoginPOM.clickCheckAgree();
		CheckwithLoginPOM.clickProductConfirm();
		CheckwithLoginPOM.clickOrderConfirm();
		
		screenShot.captureScreenShot("Six");
		
	}
}
