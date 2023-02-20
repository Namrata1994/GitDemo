package rahulshettyacademy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		//initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//Page Factory
	@FindBy(id="user_email")
	WebElement userEmail;
	
	@FindBy(id="user_password")
	WebElement userPasswordElement;
	
	//These all are web elements which i have declared
	@FindBy(id="user_company")
	WebElement userCompany;
	
	@FindBy(id="user_domain")
	WebElement userDomain;
	
	@FindBy(id="btn-buynow")
	WebElement submit;
	 
	
	//Action Method
	public void loginApplicationNmbrs(String email,String password,String company,String domain)
	{
		userEmail.sendKeys(email);
		userPasswordElement.sendKeys(password);
		userCompany.sendKeys(company);
		userDomain.sendKeys(domain);
		submit.click();
		
	}
	public void goTo()
	{
		driver.get("https://signup.onboardingapp-nmbrs.com/common/signup.html?country=nl&type=business");
	}
}


