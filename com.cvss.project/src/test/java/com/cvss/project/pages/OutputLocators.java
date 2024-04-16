package com.cvss.project.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OutputLocators {

	
	
	public WebDriver driver;

	public OutputLocators(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	
	//a[starts-with(@href,'/vuln-metrics/cvss/v2-calculator?vector=')]
	@FindBy(xpath="//a[starts-with(@href,'/vuln-metrics/cvss/v2-calculator?vector=')]")
	WebElement vector;
	
	//dd[@id='cvss-base-score-cell']
	@FindBy(xpath="//dd[@id='cvss-base-score-cell']")
	WebElement baseScore;
	
	//dd[@id='cvss-temporal-score-cell']
		@FindBy(xpath="//dd[@id='cvss-temporal-score-cell']")
		WebElement tempScore;
	
	public void getScoresAndVector() {

		//JavascriptExecutor js = (JavascriptExecutor) driver;

		//js.executeScript("arguments[0].click();", vector);
		
		System.out.println("Vector: "+ vector.getText());
		System.out.println("BaseScore: "+baseScore.getText());
		System.out.println("TempScore: "+ tempScore.getText());

		
	}
		

}
