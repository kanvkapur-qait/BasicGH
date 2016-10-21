package session14;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tatoc {

	WebDriver driver;
	
	@Test(priority = 1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanvkapur\\Desktop\\eclipse-java-mars-1-win32-x86_64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.0.1.86/tatoc/basic/grid/gate");
	}
	
	@Test (priority = 2)
	public void gategrid() {
		driver.findElement(By.cssSelector(".greenbox")).click();
	}
	
	@Test (priority = 3)
	public void framedungeon() {
		driver.switchTo().frame("main");
		String box1 = driver.findElement(By.xpath("//div[text()='Box 1']")).getAttribute("class");
		System.out.println("no element?");
		driver.switchTo().frame("child");
		while (!driver.findElement(By.id("answer")).getAttribute("class").equalsIgnoreCase(box1)) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
			driver.findElement(By.xpath("//a[text()='Repaint Box 2']")).click();
			driver.switchTo().frame("child");
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		driver.findElement(By.xpath("//a[text()='Proceed']")).click();
		System.out.println("clicked on proceed button");
	}
	
	@Test (priority = 4)
	public void draganddrop() {
		WebElement source = driver.findElement(By.id("dragbox"));
		WebElement target = driver.findElement(By.id("dropbox"));
		Actions drag = new Actions(driver);
		drag.dragAndDrop(source, target).build().perform();
		driver.findElement(By.xpath("//a[text()='Proceed']")).click();
	}
	
	@Test (priority = 5)
	public void popupwindow() {
		driver.findElement(By.cssSelector("[onclick*=launch]")).click();
		Set<String> tabs = driver.getWindowHandles();
		Object number[] = tabs.toArray();
		driver.switchTo().window(number[1].toString());
		WebElement name = driver.findElement(By.cssSelector("[type='text']"));
		name.clear();
		name.sendKeys("Kanv Kapur");
		driver.findElement(By.cssSelector("[value='Submit']")).click();
		driver.switchTo().window(number[0].toString());
		driver.findElement(By.xpath("//a[text()='Proceed']")).click();
	}
	
	@Test (priority = 6)
	public void cookiehandllng() {
		driver.findElement(By.cssSelector("[onclick*='generate']")).click();
		String tokenfull = driver.findElement(By.cssSelector("#token")).getText();
		String value = tokenfull.substring(7);
		Cookie token = new Cookie("Token", value);
		driver.manage().addCookie(token);
		driver.findElement(By.xpath("//a[text()='Proceed']")).click();
	}
}