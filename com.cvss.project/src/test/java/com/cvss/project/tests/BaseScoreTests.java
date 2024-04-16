package com.cvss.project.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cvss.project.pages.BaseScoreMetricLocators;
import com.cvss.project.pages.EnvironmentScoreMetrics;
import com.cvss.project.pages.OutputLocators;

public class BaseScoreTests extends BaseClass {

	BaseScoreMetricLocators bScoreMet;
	private static final Logger logger = LogManager.getLogger(BaseScoreTests.class);

	OutputLocators output;

	@Test
	public void user_opens_url() throws Exception {

		int numOfLoops = readPropeties();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		logger.debug("windows scrolled down....");
		bScoreMet = new BaseScoreMetricLocators(driver);

		output = new OutputLocators(driver);
		logger.info("Testing.....");
		bScoreMet.loopOver(numOfLoops);
		output.getScoresAndVector();

		logger.info("Done...");

	}

	private Integer readPropeties() {

		// Load properties from file
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/test/resources/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		// Get the value of the property "number_of_loops"
		int numberOfLoops = Integer.parseInt(properties.getProperty("number_of_loops"));
		return numberOfLoops;
	}

}
