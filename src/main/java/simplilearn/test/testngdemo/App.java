package simplilearn.test.testngdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	WebDriver driver;
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\simplilearn-workspace-phase3_new\\WebDriverProject\\drivers\\chromedriver.exe");
		//	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			
			WebDriver driver = new ChromeDriver();
//			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	

//		List<WebElement> webElements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
//			List<WebElement> webElements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
			//		System.out.println("No of Coloumns = " + webElements.size());

//			WebElement webElements = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]"));


//		System.out.println("No of Coloumns = " + webElements.getText());
		
//			System.out.println("No of Coloumns = " + webElements.getAttribute("value"));
			
			
			WebElement ScrollElement = driver.findElement(By.xpath("//*[text()='Define an HTML Table']"));

			JavascriptExecutor obj = (JavascriptExecutor) driver;
			obj.executeScript("arguments[0].scrollIntoView();", ScrollElement);
			
			
			
			//driver.quit();
			
			
			
	}

}
