package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunPOM {
private WebDriver driver; 
	
	public LoginFunPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement MyAccount; 
	
	@FindBy(linkText="Login")
	private WebElement Logindrop;
	
	public void clickMyAccount() {
		this.MyAccount.click(); 
	}
	public void clickLogin() {
		this.Logindrop.click(); 
	}
	@FindBy(id="input-email")
	private WebElement emailAddr;
	
	@FindBy(id="input-password")
	private WebElement pssword;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement Loginbutton;
	
	public void sendemailAddr(String emailAddr) {
		this.emailAddr.clear();
		this.emailAddr.sendKeys(emailAddr);
	}
	public void sendpssword(String pssword) {
		this.pssword.clear();
		this.pssword.sendKeys(pssword);
	}
	public void clickLoginbutton() {
		this.Loginbutton.click();
	}

}

