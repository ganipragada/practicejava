package rahulsettyAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionPractice {
	static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span#nav-link-accountList-nav-line-1")));
		WebElement move = driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1"));
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hellow").keyUp(Keys.SHIFT).sendKeys("ganendra").build().perform();

		a.moveToElement(move).contextClick().build().perform();

	}

}
