package session14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG {
	
	WebDriver driver;
	
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanvkapur\\Desktop\\eclipse-java-mars-1-win32-x86_64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/kanvkapur/Desktop/Automation/iframeexample/iframe.htm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void switchToFrame() {
		WebElement frame = driver.findElement(By.cssSelector("iframe"));
		driver.switchTo().frame(frame);
		System.out.println(driver.findElement(By.cssSelector("h1")).getText());
	}
	
	@BeforeMethod
	public void start() {
		Reporter.log("Start Testing", true);
		
		System.out.println("Start Testing");
	}
	
	
}