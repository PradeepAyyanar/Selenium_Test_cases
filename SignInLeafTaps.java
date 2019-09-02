package week2.day1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignInLeafTaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		WebElement pass = driver.findElementById("password");
		pass.sendKeys("crmsfa");
		WebElement login = driver.findElementByXPath("//input[@class='decorativeSubmit']");
		login.click();
		Thread.sleep(2000);
		WebElement link = driver.findElementByLinkText("CRM/SFA");
		link.click();
		Thread.sleep(3000);
		WebElement leadcreate = driver.findElementByLinkText("Create Lead");
		leadcreate.click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName' ]").sendKeys("HTSS");
		//driver.findElementById("createLeadForm_parentPartyId").sendKeys("MKT");
		driver.findElementById("createLeadForm_firstName").sendKeys("Pradeep");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ayyanar");
		WebElement sourceSel = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		sourceSel.sendKeys("Conference");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("kali");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("rajan");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("PradeepAS");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Rajan");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("2000");
		driver.findElementById("createLeadForm_currencyUomId").sendKeys("USD - American Dollar");
		driver.findElementById("createLeadForm_industryEnumId").sendKeys("Computer Software");
		//Dimension size = driver.findElementById("createLeadForm_ownershipEnumId").getSize();
		WebElement selOwner = driver.findElementById("createLeadForm_ownershipEnumId");
		Select selectOwner = new Select(selOwner);
		int size2 = selectOwner.getOptions().size();
		selectOwner.selectByIndex(size2-1);
		driver.findElementById("createLeadForm_sicCode").sendKeys("123456");
		driver.findElementById("createLeadForm_description").sendKeys("This is my description for your kind information!");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Please keep this confidential");
		WebElement countryCode = driver.findElementById("createLeadForm_primaryPhoneCountryCode");
		countryCode.clear();
		countryCode.sendKeys("2");
		WebElement areaCode = driver.findElementById("createLeadForm_primaryPhoneAreaCode");
		areaCode.clear();
		areaCode.sendKeys("5");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("03");
		driver.findElementById("createLeadForm_departmentName").sendKeys("QA/Software testing");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("5001");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("0435");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8667372118");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("pradeep");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("pradeephere09@gmail.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("facebook.com/PradeepAyyanar");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Ayyanar");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Pradeep");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("56,Pillayar koil street");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Thiruvanchery");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		WebElement province = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select provinceId = new Select(province);
		int size3 = provinceId.getOptions().size();
		provinceId.selectByIndex(size3-2);
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600001");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("06");
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketSel = new Select(market);
		int size4 = marketSel.getOptions().size();
		marketSel.selectByIndex(size4-3);
		driver.findElementByName("submitButton").click();
		Thread.sleep(5000);
		WebElement firstName = driver.findElementById("viewLead_firstName_sp");
		String printName = firstName.getText();
		System.out.println(printName);
	}

}
