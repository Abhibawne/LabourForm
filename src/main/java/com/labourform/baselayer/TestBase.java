package com.labourform.baselayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.labourform.pagelayer.LabourFrom;

public class TestBase {
	
	public static LabourFrom labour_form_page;
	
	
	
	
	String URL ="https://vj-labour-onboarding-form.web.app/";
	public static WebDriver driver;

	@BeforeMethod
	public void BrowserOpen() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\Amol\\com.labourform.com\\resources\\chromedriver.exe");
//		ChromeOptions o=new ChromeOptions();
//		o.addArguments("--disable-notifications");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void BrowserClose() {
		driver.quit();
	}
}
