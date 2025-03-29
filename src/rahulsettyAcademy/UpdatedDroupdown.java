package rahulsettyAcademy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UpdatedDroupdown {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		Robot ro = new Robot();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_SUBTRACT);
		ro.keyRelease(KeyEvent.VK_SUBTRACT);
		ro.keyPress(KeyEvent.VK_SUBTRACT);
		ro.keyRelease(KeyEvent.VK_SUBTRACT);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		// driver.switchTo().alert().dismiss();
		WebElement passengers = driver.findElement(
				By.xpath("//div[@class=\"css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim\"]/div[5]/div[1]"));
		passengers.click();
		WebElement addPassengers = driver
				.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz\"][1]/div[3]"));
		for (int i = 0; i < 5 - 1; i++) {
			addPassengers.click();
		}
		String numberOfAdult = driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim\"]/div[5]/div[1]/div/div/div[2]")).getText();
		System.out.println(numberOfAdult);
		Assert.assertEquals(numberOfAdult, "5 Adults");
		driver.close();
	}

}
