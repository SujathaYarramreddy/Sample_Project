package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginPOM1;
import com.training.pom.LoginPOM_Complex2_and_3;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginExcelTest_Complex2_and_3 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM1 loginPOM1;
	private LoginPOM_Complex2_and_3 logincomplex2;
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
		loginPOM1 = new LoginPOM1(driver);
		logincomplex2 = new LoginPOM_Complex2_and_3(driver);
		baseUrl = properties.getProperty("baseURL");
		String adminUrl = properties.getProperty("adminURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(adminUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String userName, String password, String prodname, String metatitle, String model, String price, String inptcatg, String discquant, String discprice, String point) {
		loginPOM1.sendUserName(userName);
		loginPOM1.sendPassword(password);
		loginPOM1.clickLoginBtn();
		screenShot.captureScreenShot(userName);
		logincomplex2.clickOnCatg();
		screenShot.captureScreenShot("Catalog");
		logincomplex2.clickOnProd();
		screenShot.captureScreenShot("Products");
		logincomplex2.clickOnAddnew();
		screenShot.captureScreenShot("Addnew");
		logincomplex2.sendProductName(prodname);
		screenShot.captureScreenShot("prodcut name");
		logincomplex2.sendMetatitle(metatitle);
		screenShot.captureScreenShot("Meta Title");
		logincomplex2.clickOnData1();
		screenShot.captureScreenShot("Data tab");
		logincomplex2.sendModel(model);
		screenShot.captureScreenShot("Model");
		logincomplex2.sendPrice(price);
		screenShot.captureScreenShot("price");
		logincomplex2.clickOnLinks();
		screenShot.captureScreenShot("Links");
		logincomplex2.sendInputCatg(inptcatg);
		screenShot.captureScreenShot("Input Catagories");
		logincomplex2.clickOnDisc();
		screenShot.captureScreenShot("Discount");
		logincomplex2.clickOnaddDisc();
		screenShot.captureScreenShot("Add Discount");
		logincomplex2.sendDiscquant(discquant);
		screenShot.captureScreenShot("Discount Qunatity");
		logincomplex2.sendDiscprice(discprice);
		screenShot.captureScreenShot("Discount Price");
		logincomplex2.clickOnstartdate();
		screenShot.captureScreenShot("Start Date");
		logincomplex2.clickOnenddate();
		screenShot.captureScreenShot("End Date");
		logincomplex2.clickOnreward();
		screenShot.captureScreenShot("Reward Points");
		logincomplex2.sendRewardpoints(point);
		screenShot.captureScreenShot("Points");
		logincomplex2.clickOnSave1();
		screenShot.captureScreenShot("Success");
		

	}

}