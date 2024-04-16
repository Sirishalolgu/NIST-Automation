package com.cvss.project.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnvironmentScoreMetrics {

	
	public WebDriver driver;

	public EnvironmentScoreMetrics(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	//div[@id='cvss-environmental-form']//div[1]//div[1]//fieldset[1]//div[1]//button[1]
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[1]//fieldset[1]//div[1]//button[1]")
	WebElement notdefinCP;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[1]//fieldset[1]//div[1]//button[2]")
	WebElement noneTD;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[1]//fieldset[1]//div[1]//button[3]")
	WebElement lowCPL;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[1]//fieldset[1]//div[1]//button[4]")
	WebElement lowCPM;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[1]//fieldset[1]//div[1]//button[5]")
	WebElement mediumCPM;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[1]//fieldset[1]//div[1]//button[6]")
	WebElement highCDP;
	
	//div[@id='cvss-environmental-form']//div[1]//div[2]//fieldset[1]//div[1]//button[1]
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[2]//fieldset[1]//div[1]//button[1]")
	WebElement notdefinTD;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[2]//fieldset[1]//div[1]//button[2]")
	WebElement noneTN;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[2]//fieldset[1]//div[1]//button[3]")
	WebElement lowTDL;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[2]//fieldset[1]//div[1]//button[4]")
	WebElement mediumTDM;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[2]//fieldset[1]//div[1]//button[5]")
	WebElement highTDH;
	
	
	//div[@id='cvss-environmental-form']//div[1]//div[3]//fieldset[1]//div[1]//button[1]
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[3]//fieldset[1]//div[1]//button[1]")
	WebElement notdefinCRND;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[3]//fieldset[1]//div[1]//button[2]")
	WebElement lowCRL;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[3]//fieldset[1]//div[1]//button[3]")
	WebElement mediumCRM;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[3]//fieldset[1]//div[1]//button[4]")
	WebElement highCRH;
	
	
	//div[@id='cvss-environmental-form']//div[1]//div[4]//fieldset[1]//div[1]//button[1]
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[4]//fieldset[1]//div[1]//button[1]")
	WebElement notdefinIRND;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[4]//fieldset[1]//div[1]//button[2]")
	WebElement lowIRL;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[4]//fieldset[1]//div[1]//button[3]")
	WebElement mediumIRM;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[4]//fieldset[1]//div[1]//button[4]")
	WebElement highIRH;
	
	
	//div[@id='cvss-environmental-form']//div[1]//div[5]//fieldset[1]//div[1]//button[1]
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[5]//fieldset[1]//div[1]//button[1]")
	WebElement notdefinARND;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[5]//fieldset[1]//div[1]//button[2]")
	WebElement lowARL;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[5]//fieldset[1]//div[1]//button[3]")
	WebElement mediumARM;
	@FindBy(xpath = "//div[@id='cvss-environmental-form']//div[1]//div[5]//fieldset[1]//div[1]//button[4]")
	WebElement highARH;
	
	
	
	
	
		
	
	
}
