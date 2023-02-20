package rahulshettyacademy.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public ChromeDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		//properties class can read global properties
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\rahulshettyacademy\\resources\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			//Firefox
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			
			// Edge
			System.setProperty("webdriver.edge.driver", "edge.exe");
			 driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
			}
	public void launchApplication() throws IOException
	{
		 driver= initializeDriver();
	}
}
nbjsbdfjsjdbvhjsbhjsdfjbeshjfbds
