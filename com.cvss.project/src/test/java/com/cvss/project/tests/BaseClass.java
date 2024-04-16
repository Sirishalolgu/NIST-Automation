package com.cvss.project.tests;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    private static final Logger logger = LogManager.getLogger(BaseClass.class);

	protected WebDriver driver;

	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger.info("Setting up webdriver..");
		driver.get("https://nvd.nist.gov/vuln-metrics/cvss/v2-calculator?");
		logger.debug("launching the url...");
	}

	@AfterTest
	public void teardown() throws IOException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,-500)");
				Date currentdate=new Date();
				String screenshotfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+screenshotfilename+".png"));

		if(driver!=null) {
			driver.quit();
		}
	}
}
