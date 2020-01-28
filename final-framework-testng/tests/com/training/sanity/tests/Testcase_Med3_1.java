package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.LinearGradientPaint;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM1;
import com.training.pom.LoginPOM2;
import com.training.pom.LoginPOM3;
import com.training.pom.LoginPOM_Med1;
import com.training.pom.LoginPOM_Med2;
import com.training.pom.LoginPOM_Med3;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Testcase_Med3_1 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM1 loginPOM1;
	private LoginPOM_Med1 loginPOM_Med1;
	private LoginPOM_Med3 loginPOM_Med3;
	private static Properties properties;
	private ScreenShot screenShot;
	private String adminURL;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM1 = new LoginPOM1(driver);
		loginPOM_Med1 = new LoginPOM_Med1(driver); 
		loginPOM_Med3 = new LoginPOM_Med3(driver);
		baseUrl = properties.getProperty("baseURL");
		adminURL= properties.getProperty("adminURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);

	}

	/*@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}*/
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException, AWTException {
		 
		
		loginPOM_Med3.clickShirt();
		loginPOM_Med3.clickSize();
		loginPOM_Med3.clickCart();
		loginPOM_Med3.clickCartButton();
		loginPOM_Med3.sendFirstname("Sujatha");
		loginPOM_Med3.sendLastname("Siva");
		loginPOM_Med3.sendEmail("sujatha355@in.ibm.com");
		loginPOM_Med3.sendTelephone("1234567890");
		loginPOM_Med3.sendPassword("ramsuji@a12");
		loginPOM_Med3.sendConfirmpwd("ramsuji@a12");
		loginPOM_Med3.sendAddress1("chennai");
		loginPOM_Med3.sendCity("Chennai");
		loginPOM_Med3.sendPostalcode("6000091");
		loginPOM_Med3.selectRegion();
		loginPOM_Med3.clickOnAgree();
		loginPOM_Med3.clickRegister();
		loginPOM_Med3.clickshipAddress();
		loginPOM_Med3.clickshipMethod();
		loginPOM_Med3.clickOnAgree1();
		loginPOM_Med3.clickPayment();
		loginPOM_Med3.clickConfirm();
		screenShot.captureScreenShot("First_Med3");
		driver.close();
	}
		
}



