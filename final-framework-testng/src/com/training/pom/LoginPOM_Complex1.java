package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
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

public class LoginPOM_Complex1{
	private WebDriver driver; 
	
	public LoginPOM_Complex1(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
		
		//--Cancel the order
	
	
	@FindBy(id="sale")
	private WebElement sales;
	
	public void clickOnSales() {
		sales.click();
	}
	
	@FindBy(linkText="Orders")
	private WebElement ord;
	
	public void clickOnOrders() {
		
		ord.click();
	}
	
		
	@FindBy(xpath="//i[contains(@class,'fa-eye')]")
	private WebElement view;
		
	public void clickOnViewicon() {
			
			view.click();
	}
		
		@FindBy(id="input-order-status")
		private WebElement orderstatus;
		
		public void selectOrderstatus() {
			Select sel = new Select(orderstatus);
			sel.selectByVisibleText("Complete");
		}
		
		@FindBy(id="button-history")
		private WebElement btnhistory;
		
		public void clickOnAddhistory(){
			btnhistory.click();
		}
		
		//--launching the Base URL to view for order History
		
		@FindBy(xpath="//i[contains(@class,'fa-user')]")
		private WebElement user;
		
		public void clickUser() {
			user.click();
		}
		
		@FindBy(linkText="Login")
		private WebElement login;
		
		public void clickOnlogin() {
			login.click();	
		}
		
		@FindBy(id="input-email")
		private WebElement inptemail;
		
		public void sendEmail(String inptemail) {
			this.inptemail.clear();
			this.inptemail.sendKeys(inptemail);
		}
		
		@FindBy(id="input-password")
		private WebElement inptpwd;
		
		public void sendPassword(String inptpwd) {
			this.inptpwd.clear();
			this.inptpwd.sendKeys(inptpwd);
		}
		
		@FindBy(xpath="//input[contains(@value,'Login')]")
		private WebElement userlogin;
		
		public void clickOnLogin() {
			userlogin.click();
		}
		
		@FindBy(linkText="View your order history")
		private WebElement ordhistory;
		
		public void clickOnordhisotry() {
			ordhistory.click();
		}
		
		
}


