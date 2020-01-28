package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPOM_Med3 {
	private WebDriver driver; 
	
	public LoginPOM_Med3(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	//-- Placing the order
	
	@FindBy(xpath="//a[contains(@href,'id=179')]")
	private WebElement shirt;
	
	public void clickShirt() {
		/*ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));*/
		shirt.click();
	}
	
	
	@FindBy(name="option[368]")
	private WebElement size;
	
	public void clickSize() {
		
	if (!(size.isSelected())) {
	    size.click();
					
		} 
	}
	
	@FindBy(id="button-cart")
	private WebElement cart;
	
	public void clickCart() {
		cart.click();
	}
	
	@FindBy(xpath="//button[contains(@class,'btn-inverse')]")
	private WebElement cart_button;
	
	@FindBy(xpath="//a[contains(@href,'checkout/cart')]")
	 private WebElement viewcart;
	
	@FindBy(linkText="Checkout")
	 private WebElement checkout;
	
	@FindBy(id="button-account")
	private WebElement register;
	
	 public void clickCartButton() {
		 cart_button.click();
		 viewcart.click();
		 checkout.click();
		 register.click();
	 }
	  
		@FindBy(id="input-payment-firstname")
		private WebElement firstname;
		
		public void sendFirstname(String firstname) {
			this.firstname.clear();
			this.firstname.sendKeys(firstname);
			
		}
		@FindBy(id="input-payment-lastname")
		private WebElement lastname;
		
		public void sendLastname(String lastname) {
			this.lastname.clear();
			this.lastname.sendKeys(lastname);
			
		}
		
		@FindBy(id="input-payment-email")
		private WebElement email;
		
		public void sendEmail(String email) {
			this.email.clear();
			this.email.sendKeys(email);
			
		}
		
		@FindBy(id="input-payment-telephone")
		private WebElement telephone;
		
		public void sendTelephone(String telephone) {
			this.telephone.clear();
			this.telephone.sendKeys(telephone);
			
		}
		
		@FindBy(id="input-payment-password")
		private WebElement password;
		
		public void sendPassword(String password) {
			this.password.clear();
			this.password.sendKeys(password);
			
		}
		
		@FindBy(id="input-payment-confirm")
		private WebElement confirmpwd;
		
		public void sendConfirmpwd(String confirmpwd) {
			this.confirmpwd.clear();
			this.confirmpwd.sendKeys(confirmpwd);
			
		}
		
		@FindBy(id="input-payment-address-1")
		private WebElement address1;
		
		public void sendAddress1(String address1) {
			this.address1.clear();
			this.address1.sendKeys(address1);
			
		}
		
		@FindBy(id="input-payment-city")
		private WebElement city;
		
		public void sendCity(String city) {
			this.city.clear();
			this.city.sendKeys(city);
			
		}
		
		@FindBy(id="input-payment-postcode")
		private WebElement postalcode;
		
		public void sendPostalcode(String postalcode) {
			this.postalcode.clear();
			this.postalcode.sendKeys(postalcode);
			
		}
		@FindBy(id="input-payment-zone")
		private WebElement region;
		
		public void selectRegion() {
			Select sel = new Select(region);
			sel.selectByVisibleText("Tamil Nadu");
		}
		
		@FindBy(name="agree")
		private WebElement agree;
		
		public void clickOnAgree() {
			if (!(agree.isSelected())) {
				agree.click();
			}
		}
	
		@FindBy(id="button-register")
		private WebElement btnregister;
		public void clickRegister() {
			btnregister.click();
		}
		@FindBy(id="button-shipping-address")
		private WebElement shipaddress;
		public void clickshipAddress() throws InterruptedException {
			Thread.sleep(2000);
			shipaddress.click();
		}
		
		@FindBy(id="button-shipping-method")
		private WebElement shipmethod;
		public void clickshipMethod() {
			shipmethod.click();
		}
		
		@FindBy(name="agree")
		private WebElement agree1;
		
		public void clickOnAgree1() throws InterruptedException {
			Thread.sleep(2000);
			if (!(agree1.isSelected())) {
				agree1.click();
			}
		}
	
		@FindBy(id="button-payment-method")
		private WebElement btnpayment;
		public void clickPayment() {
			btnpayment.click();
		}
		
		@FindBy(id="button-confirm")
		private WebElement btnconfirm;
		public void clickConfirm() {
			btnconfirm.click();
			String Expectedtitle = "Checkout";
			String Actualtitle = driver.getTitle();
			System.out.println(Actualtitle);
			Assert.assertEquals(Actualtitle, Expectedtitle);
		}
		
		//--Checking for the Invoice number
		@FindBy(xpath="//*[contains(@class,'shopping-cart fa-fw')]")
		private WebElement cart1;
		
		public void clickOnCart() {
			cart1.click();
		}
		
		@FindBy(linkText="Orders")
		private WebElement order;
		
		public void clickOnOrders() throws InterruptedException {
			Thread.sleep(2000);
			order.click();
		}
		
		@FindBy(xpath="//i[contains(@class,'fa fa-eye')]")
		private WebElement viewicon;
		
		public void clickOnView() throws InterruptedException {
			Thread.sleep(2000);
			viewicon.click();
		}
		
		@FindBy(xpath="//button[@id=\"button-invoice\"]/i")
		private WebElement generate;
		
		public void clickOnGenerate() throws InterruptedException {
			Thread.sleep(2000);
			generate.click();
		}
		
}

