package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckwOutPreLogPOM {
private WebDriver driver; 
	
	public CheckwOutPreLogPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
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
}
