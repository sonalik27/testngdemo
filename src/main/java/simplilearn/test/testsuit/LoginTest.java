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

public class LoginTest {
	
	WebDriver driver;
	
//	public static void main(String[] args) {
//		
//		LoginTest loginTest = new LoginTest();
//		loginTest.setup();
//		loginTest.Login();
//	}
	
	@BeforeMethod
	public void setup( ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\simplilearn-workspace-phase3_new\\WebDriverProject\\drivers\\chromedriver.exe");
		//	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			
			driver = new ChromeDriver();
//			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.simplilearn.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	@Parameters({"username","password"})
	@Test
	public void Login(String username, String password) {

		WebElement loginLink = driver.findElement(By.linkText(" Log in"));
		loginLink.click();
		
		WebElement tbEmail = driver.findElement(By.name("user_login"));
//		tbEmail.sendKeys("abc@xyz.com");
		tbEmail.sendKeys(username);
		
		WebElement tbPassword = driver.findElement(By.name("user_pwd"));
//		tbEmail.sendKeys("abc123");
		tbEmail.sendKeys(password);
		
		WebElement chRemember = driver.findElement(By.className("rememberMe"));
		chRemember.click();
		
		WebElement btnLopgin = driver.findElement(By.name("btn_login"));
		btnLopgin.click();
		

        WebElement error = driver.findElement(By.id("msg_box"));
        
        String actMsg = error.getText();
        String expMsg = "The email or password you have entered is invalid";
        
        Assert.assertEquals(expMsg, actMsg);
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
