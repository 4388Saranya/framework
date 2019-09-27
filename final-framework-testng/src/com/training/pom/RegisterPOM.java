package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPOM {
private WebDriver driver; 
	
	public RegisterPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement MyAccount; 
	
	@FindBy(linkText="Register")
	private WebElement Register;
	
	
	
	public void clickMyAccount() {
		this.MyAccount.click(); 
	}
	public void clickRegister() {
		this.Register.click(); 
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstName;
	@FindBy(id="input-lastname")
	private WebElement lastName;
	@FindBy(id="input-email")
	private WebElement eMail;
	@FindBy(id="input-telephone")
	private WebElement telePhone;
	@FindBy(id="input-address-1")
	private WebElement address1;
	@FindBy(id="input-city")
	private WebElement city;
	
	@FindBy(id="input-postcode")
	private WebElement postCode;
	@FindBy(id="input-country")
	private WebElement country;
	
	
	//Select Countrydrop=new Select(country);
	
	@FindBy(id="input-zone")
	private WebElement state;
	
	
	//Select Statedrop=new Select(state);
	
	@FindBy(id="input-password")
	private WebElement password;
	@FindBy(id="input-confirm")
	private WebElement confirmpass;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement agreechecked; 
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement submitcontin;

	
	
	
	
	
	public void sendfirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	
	public void sendlastName(String lastName) {
		this.lastName.clear(); 
		this.lastName.sendKeys(lastName); 
	}
	
	public void sendeMail(String eMail) {
		this.eMail.clear(); 
		this.eMail.sendKeys(eMail); 
	}
	public void sendtelePhone(String telePhone) {
		this.telePhone.clear(); 
		this.telePhone.sendKeys(telePhone); 
	}
	public void sendaddress1(String address1) {
		this.address1.clear(); 
		this.address1.sendKeys(address1); 
	}
	public void sendcity(String city) {
		this.city.clear(); 
		this.city.sendKeys(city); 
	}
	public void sendpostCode(String postCode) {
		this.postCode.clear(); 
		this.postCode.sendKeys(postCode); 
	}

	public void selectCountry() {
		  Select Countrydrop=new Select(country);
		  Countrydrop.selectByVisibleText("India");
		  
			//this.Countrydrop.selectByVisibleText("India");
			
		}
	
	public void selectState() {
        Select Statedrop=new Select(state);
        Statedrop.selectByVisibleText("Karnataka");
		//this.Statedrop.selectByVisibleText("Karnataka");
		
	}
	
	public void sendpassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	public void sendconfirmpass(String confirmpass) {
		this.confirmpass.clear();
		this.confirmpass.sendKeys(confirmpass);
	}
	
	public void clickagreechecked() {
		this.agreechecked.click(); 
	}
	public void clicksubmitcontin() {
		this.submitcontin.click(); 
	}

}
