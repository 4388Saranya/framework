package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CheckwithLoginPOM {
private WebDriver driver; 
	
	public CheckwithLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement MyAccount1; 
	
	@FindBy(linkText="Login")
	private WebElement Logindrop1;
	
	public void clickMyAccount() {
		this.MyAccount1.click(); 
	}
	public void clickLogin() {
		this.Logindrop1.click(); 
	}
	@FindBy(id="input-email")
	private WebElement emailAddr1;
	
	@FindBy(id="input-password")
	private WebElement pssword1;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement Loginbutton1;
	
	public void sendemailAddr(String emailAddr) {
		this.emailAddr1.clear();
		this.emailAddr1.sendKeys(emailAddr);
	}
	public void sendpssword(String pssword) {
		this.pssword1.clear();
		this.pssword1.sendKeys(pssword);
	}
	public void clickLoginbutton() {
		this.Loginbutton1.click();
	}

	
	@FindBy(xpath="//a[contains(text(),'Uniform Store')]")
	private WebElement UniformStore;
	
	@FindBy(xpath="//div[@id='banner0']//div//img[@class='img-responsive']")
	private WebElement ShopUniforms; 
	
	//@FindBy(tagName="REGULAR T-SHIRTS (YELLOW)")
	@FindBy(xpath="//div[@class='box-content']//div[2]//div[1]//div[1]//div[1]//a[1]//img[1]")
	private WebElement RusTshirt;
	@FindBy(id="input-option376")
	private WebElement Size;
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement AddtoCart;
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement ViewCartimage;
	//strong[contains(text(),'View Cart')]
	@FindBy(xpath="//strong[contains(text(),'View Cart')]")
	private WebElement ViewCartbutton;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement Checkout;
	@FindBy(xpath="//input[@id='button-payment-address']")
	private WebElement ContiBillDet;
	@FindBy(xpath="//input[@id='button-shipping-address']")
	private WebElement ContiDelDet;
	//div[@id='collapse-shipping-method']//textarea[@name='comment']
	@FindBy(xpath="//div[@id='collapse-shipping-method']//textarea[@name='comment']")
	private WebElement Entercomments;
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	private WebElement ContiComments;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement CheckAgree;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	private WebElement ProductConfirm;
	
	@FindBy(xpath="//input[@id='button-confirm']")
	private WebElement OrderConfirm;
	
	
	
	public void clickUniformStore() {
		this.UniformStore.click(); 
	}
	
	
	public void clickShopUniforms() {
		this.ShopUniforms.click(); 
	}
	public void clickRusTshirt() {
		this.RusTshirt.click(); 
	}
	public void selectSize() {
		  Select Sizedrop=new Select(Size);
		  Sizedrop.selectByVisibleText("40");
			
		}
	public void clickAddtoCart() {
		this.AddtoCart.click(); 
	}
	public void clickViewCartimage() {
		this.ViewCartimage.click(); 
	}
	public void clickViewCartbutton() {
		this.ViewCartbutton.click(); 
	}
	public void clickCheckout() {
		this.Checkout.click(); 
	}
	public void clickContiBillDet() {
		this.ContiBillDet.click(); 
	}
	public void clickContiDelDet() {
		this.ContiDelDet.click(); 
	}
	public void sendEnterComments(String Entercomments) {
		this.Entercomments.clear();
		this.Entercomments.sendKeys(Entercomments);
	}
	public void clickContiComments() {
		this.ContiComments.click(); 
	}
	public void clickCheckAgree() {
		this.CheckAgree.click(); 
	}
	public void clickProductConfirm() {
		this.ProductConfirm.click(); 
	}
	public void clickOrderConfirm() {
		this.OrderConfirm.click(); 
	}
}

