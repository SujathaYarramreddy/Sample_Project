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

public class LoginPOM_Complex2_and_3 {
	private WebDriver driver; 
	
	public LoginPOM_Complex2_and_3(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		//--Complex 2
		
		@FindBy(id="catalog")
		private WebElement catg;
		
		public void clickOnCatg() {
			catg.click();
		}
		@FindBy(linkText="Products")
		private WebElement prod;
		
		public void clickOnProd() {
			prod.click();
		}
		
		@FindBy(xpath="//i[contains(@class,'fa-plus')]")
		private WebElement addnew;
		
		public void clickOnAddnew() {
			addnew.click();
		}
		
		@FindBy(id="input-name1")
		private WebElement prodname;
		
		public void sendProductName(String prodname) {
			this.prodname.clear();
			this.prodname.sendKeys(prodname);
		}
		
		@FindBy(id="input-meta-title1")
		private WebElement metatitle;
		
		public void sendMetatitle(String metatitle) {
			this.metatitle.clear();
			this.metatitle.sendKeys(metatitle);
		}
		
		@FindBy(linkText="Data")
		private WebElement data1;
		
		public void clickOnData1() {
			data1.click();
			
		}
	
		
		@FindBy(id="input-model")
		private WebElement model;
		
		public void sendModel(String model) {
			this.model.clear();
			this.model.sendKeys(model);
		}
		
		@FindBy(id="input-price")
		private WebElement price;
		
		public void sendPrice(String price) {
			this.price.clear();
			this.price.sendKeys(price);
		}
		
		@FindBy(linkText="Links")
		private WebElement links;
		
		public void clickOnLinks() {
			links.click();
		}
		
		@FindBy(id="input-category")
		private WebElement inptcatg;
		
		public void sendInputCatg(String inptcatg) {
			this.inptcatg.clear();
			this.inptcatg.sendKeys(inptcatg);
		}
		
		@FindBy(linkText="Discount")
		private WebElement disc;
		
		public void clickOnDisc() {
			disc.click();
		}
		
		@FindBy(xpath="(//i[contains(@class,'fa-plus-circle')])[3]")
		private WebElement adddisc;
		
		public void clickOnaddDisc() {
			adddisc.click();
		}
		@FindBy(name="product_discount[0][quantity]")
		private WebElement discquant;
		
		public void sendDiscquant(String discquant) {
			this.discquant.clear();
			this.discquant.sendKeys(discquant);
		}
		@FindBy(name="product_discount[0][price]")
		private WebElement discprice;
		
		public void sendDiscprice(String discprice) {
			this.discprice.clear();
			this.discprice.sendKeys(discprice);
		}
		@FindBy(xpath="(//i[contains(@class,'fa-calendar')])[2]")
		private List<WebElement> startdate;
		
		public void clickOnstartdate() {
		for (WebElement webElement : startdate) {
			String text = webElement.getText();
			if (text.equalsIgnoreCase("2")) { 
				webElement.click(); 
			}
			
		}	
		}
		
		@FindBy(xpath="(//i[contains(@class,'fa-calendar')])[3]")
		private List<WebElement> enddate;
		
		public void clickOnenddate() {
		for (WebElement webElement1 : enddate) {
			String text1 = webElement1.getText();
			if (text1.equalsIgnoreCase("3")) { 
				webElement1.click(); 
			}
			
		}	
		}
		@FindBy(linkText="Reward Points")
		private WebElement reward;
		
		public void clickOnreward() {
			reward.click();
		}
		
		@FindBy(id="input-points")
		private WebElement point;
		
		public void sendRewardpoints(String point) {
			this.point.clear();
			this.point.sendKeys(point);
		}
		
		@FindBy(xpath="//i[contains(@class,'fa-save')]")
		private WebElement save1;
		
		public void clickOnSave1() {
			save1.click();
		}
		
}


