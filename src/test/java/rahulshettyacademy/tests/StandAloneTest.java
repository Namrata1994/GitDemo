package rahulshettyacademy.tests;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobjects.LandingPage;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); //Based on ChromeDriver version chromedriver is automatically downlaoded into the system
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.goTo();
		
		driver.manage().deleteAllCookies();
		
		landingpage.loginApplicationNmbrs("namratasharma474@gmail.com", "Welcome1994@rsmadhur", "Nmbrs", "abcde");
		driver.findElement(By.id("user_firstname")).sendKeys("namrata");
		driver.findElement(By.id("user_surname")).sendKeys("sharma");
		driver.findElement(By.id("user_phonenumber")).sendKeys("1234567");
		driver.findElement(By.id("affiliate-show")).click();
		driver.findElement(By.id("user_affiliatecode")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.id("btn-finish")).click();
		
		driver.navigate().to("https://onboardingapp.nmbrs.com/BUS/NL/Inventarisation");
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(),"Create a free account, no payment details required! ");
		Assert.assertTrue(true);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.id("password-warning")).getText());
				
		driver.quit();
		
	

	}

}
