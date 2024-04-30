package com.cvss.project.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cvss.project.tests.BaseScoreTests;

public class BaseScoreMetricLocators {

	
    private static final Logger logger = LogManager.getLogger(BaseScoreMetricLocators.class);

	private static final String CONFI_RRR = "confiRRR";
	private static final String UNCORR_RUR = "uncorrRUR";
	private static final String UNCON_RUC = "unconRUC";
	private static final String NOTDEFIN_RC = "notdefinRC";
	private static final String UNAV_RL = "unavRL";
	private static final String WRK_RL = "wrkRL";
	private static final String TEMPORY_RL = "temporyRL";
	private static final String OFFICIAL_RLOF = "officialRLOF";
	private static final String NOTDEFIN_RL = "notdefinRL";
	private static final String HIGH_EH = "highEH";
	private static final String FUNCTIONAL_EPOC = "functionalEPOC";
	private static final String PROOF_EPOC = "proofEPOC";
	private static final String UNPROVEN_EU = "unprovenEU";
	private static final String NOTDEFIN_END = "notdefinEnd";
	private static final String COMPLETE_AC = "completeAC";
	private static final String PARTIAL_AP = "partialAP";
	private static final String NONE_AN = "noneAN";
	private static final String COMPLETE_IC = "completeIC";
	private static final String PARTIAL_IP = "partialIP";
	private static final String NONE_IN = "noneIN";
	private static final String COMPLETE_CC = "completeCC";
	private static final String PARTIAL_CP = "partialCP";
	private static final String NONE_CN = "noneCN";
	private static final String LOCAL_AV = "localAV";
	private static final String ADJACENT_AV = "adjacentAV";
	private static final String NETWORK_AV = "networkAV";
	
	private static final String HIGH_AC = "highAC";
	private static final String MEDIUM_AC = "mediumAC";
	private static final String LOW_AC = "lowAC";
	
	private static final String MULTI_AU = "multiAU";
	private static final String SINGLE_AU = "singleAU";
	private static final String NONE_AU = "noneAU";
		
	public WebDriver driver;

	public BaseScoreMetricLocators(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}

	@FindBy(xpath = "//div[@id='cvss-base-form']//div[1]//div[1]//fieldset[1]//div[1]//button[1]")
	WebElement localAV;
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[1]//div[1]//fieldset[1]//div[1]//button[2]")
	WebElement adjacentAV;
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[1]//div[1]//fieldset[1]//div[1]//button[3]")
	WebElement networkAV;

	@FindBy(xpath = "//div[@id='cvss-base-form']//div[1]//div[2]//fieldset[1]//div[1]//button[1]")
	WebElement highAC;
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[1]//div[2]//fieldset[1]//div[1]//button[2]")
	WebElement mediumAC;
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[1]//div[2]//fieldset[1]//div[1]//button[3]")
	WebElement lowAC;

	@FindBy(xpath = "//div[@id='cvss-base-form']//div[1]//div[3]//fieldset[1]//div[1]//button[1]")
	WebElement multiAU;
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[1]//div[3]//fieldset[1]//div[1]//button[2]")
	WebElement singleAU;
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[1]//div[3]//fieldset[1]//div[1]//button[3]")
	WebElement noneAU;

	// div[@id='cvss-base-form']//div[2]/div[1]/fieldset[1]/div[1]/button[1]
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[2]/div[1]/fieldset[1]/div[1]/button[1]")
	WebElement noneCN;
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[2]/div[1]/fieldset[1]/div[1]/button[2]")
	WebElement partialCP;
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[2]/div[1]/fieldset[1]/div[1]/button[3]")
	WebElement completeCC;

	// div[@id='cvss-base-form']//div[2]/div[2]/fieldset[1]/div[1]/button[1]
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[2]/div[2]/fieldset[1]/div[1]/button[1]")
	WebElement noneIN;
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[2]/div[2]/fieldset[1]/div[1]/button[2]")
	WebElement partialIP;
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[2]/div[2]/fieldset[1]/div[1]/button[3]")
	WebElement completeIC;

	// div[@id='cvss-base-form']//div[2]/div[3]/fieldset[1]/div[1]/button[1]
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[2]/div[3]/fieldset[1]/div[1]/button[1]")
	WebElement noneAN;
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[2]/div[3]/fieldset[1]/div[1]/button[2]")
	WebElement partialAP;
	@FindBy(xpath = "//div[@id='cvss-base-form']//div[2]/div[3]/fieldset[1]/div[1]/button[3]")
	WebElement completeAC;

	// div[@id='cvss-temporal-form']//div[1]//div[1]//fieldset[1]//div[1]//button[5]
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[1]//fieldset[1]//div[1]//button[1]")
	WebElement notdefinEnd;
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[1]//fieldset[1]//div[1]//button[2]")
	WebElement unprovenEU;
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[1]//fieldset[1]//div[1]//button[3]")
	WebElement proofEPOC;
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[1]//fieldset[1]//div[1]//button[4]")
	WebElement functionalEPOC;
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[1]//fieldset[1]//div[1]//button[5]")
	WebElement highEH;

	// div[@id='cvss-temporal-form']//div[1]//div[1]//fieldset[1]//div[1]//button[5]
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[2]//fieldset[1]//div[1]//button[1]")
	WebElement notdefinRL;
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[2]//fieldset[1]//div[1]//button[2]")
	WebElement officialRLOF;
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[2]//fieldset[1]//div[1]//button[3]")
	WebElement temporyRL;
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[2]//fieldset[1]//div[1]//button[4]")
	WebElement wrkRL;
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[2]//fieldset[1]//div[1]//button[5]")
	WebElement unavRL;

	// div[@id='cvss-temporal-form']//div[1]//div[3]//fieldset[1]//div[1]//button[1]
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[3]//fieldset[1]//div[1]//button[1]")
	WebElement notdefinRC;
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[3]//fieldset[1]//div[1]//button[2]")
	WebElement unconRUC;
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[3]//fieldset[1]//div[1]//button[3]")
	WebElement uncorrRUR;
	@FindBy(xpath = "//div[@id='cvss-temporal-form']//div[1]//div[3]//fieldset[1]//div[1]//button[4]")
	WebElement confiRRR;

	// a[starts-with(@href,'/vuln-metrics/cvss/v2-calculator?vector=')]
	//@FindBy(xpath = "//a[starts-with(@href,'/vuln-metrics/cvss/v2-calculator?vector=')]")
	@FindBy(id="cvss-v2-vector-cell")
	WebElement vector;

	// dd[@id='cvss-base-score-cell']
	@FindBy(xpath = "//dd[@id='cvss-base-score-cell']")
	WebElement baseScore;

	// dd[@id='cvss-temporal-score-cell']
	@FindBy(xpath = "//dd[@id='cvss-temporal-score-cell']")
	WebElement tempScore;

	public void getScoresAndVector() {

		//JavascriptExecutor js = (JavascriptExecutor) driver;

		//js.executeScript("arguments[0].click();", vector);
		
		System.out.println("Vector: "+ vector.getText());
		System.out.println("BaseScore: "+baseScore.getText());
		System.out.println("TempScore: "+ tempScore.getText());

		
	}
	public static List<List<String>> addBaseScoreWebelementToList() {

		List<List<String>> result = new ArrayList<List<String>>();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		List<String> list5 = new ArrayList<String>();

		List<String> list6 = new ArrayList<String>();
		List<String> list7 = new ArrayList<String>();
		List<String> list8 = new ArrayList<String>();
		List<String> list9 = new ArrayList<String>();

		List<String> list10 = new ArrayList<String>();
		List<String> list11 = new ArrayList<String>();
		List<String> list12 = new ArrayList<String>();

		list1.add(LOCAL_AV);
		list1.add(ADJACENT_AV);
		list1.add(NETWORK_AV);

		list2.add(HIGH_AC);
		list2.add(MEDIUM_AC);
		list2.add(LOW_AC);

		list3.add(MULTI_AU);
		list3.add(SINGLE_AU);
		list3.add(NONE_AU);

		//list4.add(NONE_CN);
		list4.add(PARTIAL_CP);
		list4.add(COMPLETE_CC);

		//list5.add(NONE_IN);
		list5.add(PARTIAL_IP);
		list5.add(COMPLETE_IC);

		//list6.add(NONE_AN);
		list6.add(PARTIAL_AP);
		list6.add(COMPLETE_AC);

	//	list7.add(NOTDEFIN_END);
		list7.add(UNPROVEN_EU);
		list7.add(PROOF_EPOC);
		list7.add(FUNCTIONAL_EPOC);
		list7.add(HIGH_EH);

		//list8.add(NOTDEFIN_RL);
		list8.add(OFFICIAL_RLOF);
		list8.add(TEMPORY_RL);
		list8.add(WRK_RL);
		list8.add(UNAV_RL);

	//	list9.add(NOTDEFIN_RC);
		list9.add(UNCON_RUC);
		list9.add(UNCORR_RUR);
		list9.add(CONFI_RRR);

		for (String element1 : list1) {
			for (String element2 : list2) {
				for (String element3 : list3) {
					for (String element4 : list4) {
						for (String element5 : list5) {
							for (String element6 : list6) {
								for (String element7 : list7) {
									for (String element8 : list8) {
										for (String element9 : list9) {

														List<String> combination = new ArrayList<String>();
														combination.add(element1);
														combination.add(element2);
														combination.add(element3);
														combination.add(element4);
														combination.add(element5);
														combination.add(element6);
														combination.add(element7);
														combination.add(element8);
														combination.add(element9);
                                                        logger.debug("added elements to innerlist...");
														result.add(combination);
                                                        logger.debug("list added to result..");

													}
												}
											}
										}
									}
								}
							}
						}
					}
		System.out.println(result.size());
		return result;
	}

	public void loopOver(int numOfLoops) {
		List<List<String>> lists = addBaseScoreWebelementToList();
		int count = 1;
		logger.info("running the combinations till "+ numOfLoops);
		System.out.println("lists size - "+ lists.size());
		for (List<String> innerlist : lists) {
			if(count >= numOfLoops) {
				break;
			}
			logger.debug("innerlist size - "+ innerlist.size());
			for (String elementStr : innerlist) {
				
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement webElement =  getWebElementByStr(elementStr);
				if(webElement != null) {
				js.executeScript("arguments[0].click();", webElement);
				
				logger.debug("clicked on webelement...");
                
                
				}
				else {
					logger.info("element not found");
				}

			}
			System.out.println("Iteration: "+ count);

			System.out.println("Vector: "+ vector.getText());
			System.out.println("BaseScore: "+baseScore.getText());
			System.out.println("TempScore: "+ tempScore.getText());
			count++;
			System.out.println("count incrementd");

		}
	}

	private WebElement getWebElementByStr(String elementStr) {
		
		WebElement webElement = null;
		switch(elementStr) {
			case LOCAL_AV:
				webElement =  localAV;
				break;
			case ADJACENT_AV:
				webElement =  adjacentAV;
				break;
			case NETWORK_AV:
				webElement =  networkAV;
				break;

			case HIGH_AC:
				webElement =  highAC;
				break;
			case MEDIUM_AC:
				webElement =  mediumAC;
				break;
			case LOW_AC:
				webElement =  lowAC;
				break;
				
			case MULTI_AU:
				webElement =  multiAU;
				break;
			case SINGLE_AU:
				webElement =  singleAU;
				break;
			case NONE_AU:
				webElement =  noneAU;
				break;
				
			case NONE_CN:
				webElement =  noneCN;
				break;
			case PARTIAL_CP:
				webElement =  partialCP;
				break;
			case COMPLETE_CC:
				webElement =  completeCC;
				break;
				
			case NONE_IN:
				webElement =  noneIN;
				break;
			case PARTIAL_IP:
				webElement =  partialIP;
				break;
			case COMPLETE_IC:
				webElement =  completeIC;
				break;
								
			case NONE_AN:
				webElement =  noneAN;
				break;
			case PARTIAL_AP:
				webElement =  partialAP;
				break;
			case COMPLETE_AC:
				webElement =  completeAC;
				break;
				
			case NOTDEFIN_END:
				webElement =  notdefinEnd;
				break;
			case UNPROVEN_EU:
				webElement =  unprovenEU;
				break;
			case PROOF_EPOC:
				webElement =  proofEPOC;
				break;
			case FUNCTIONAL_EPOC:
				webElement =  functionalEPOC;
				break;
			case HIGH_EH:
				webElement =  highEH;
				break;
				
			case NOTDEFIN_RL:
				webElement =  notdefinRL;
				break;
			case OFFICIAL_RLOF:
				webElement =  officialRLOF;
				break;
			case TEMPORY_RL:
				webElement =  temporyRL;
				break;
			case WRK_RL:
				webElement =  wrkRL;
				break;
			case UNAV_RL:
				webElement =  unavRL;
				break;

			case NOTDEFIN_RC:
				webElement =  notdefinRC;
				break;
			case UNCON_RUC:
				webElement =  unconRUC;
				break;
			case UNCORR_RUR:
				webElement =  uncorrRUR;
				break;
			case CONFI_RRR:
				webElement =  confiRRR;
				break;
			default:
                logger.warn("unexpected webelement key.."+elementStr);
 
				
		}
		return webElement;
	}

	
}
