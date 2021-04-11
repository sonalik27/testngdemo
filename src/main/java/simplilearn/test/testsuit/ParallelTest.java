package simplilearn.test.testsuit;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	
	WebDriver driver;
	WebDriver driver1;
	
//	public static void main(String[] args) {
//		
//		LoginTest loginTest = new LoginTest();
//		loginTest.setup();
//		loginTest.Login();
//	}
	
	@Test
	public void chromeTest( ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\simplilearn-workspace-phase3_new\\WebDriverProject\\drivers\\chromedriver.exe");
		//	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			
			driver = new ChromeDriver();
//			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.simplilearn.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	@Test
	public void firefoxTest( ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\simplilearn-workspace-phase3_new\\WebDriverProject\\drivers\\chromedriver.exe");
		//	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			
//			driver = new ChromeDriver();
			driver1 = new FirefoxDriver();
			
			driver1.get("https://www.simplilearn.com/");
			driver1.manage().window().maximize();
			driver1.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
}
