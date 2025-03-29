package rahulsettyAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToHandelMultipleWindowsTest {
	@Test
	public void windowHandel() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.findElement(By.id("autocomplete")).sendKeys("ind");
//		Thread.sleep(2000);
//		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		WebElement contry = driver.findElement(By.id("autocomplete"));
		contry.sendKeys("ind");
		Thread.sleep(2000);
		contry.sendKeys(Keys.DOWN,Keys.DOWN, Keys.ENTER);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
	
	
	}
}
