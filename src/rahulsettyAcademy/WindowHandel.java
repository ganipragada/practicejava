package rahulsettyAcademy;

import static org.testng.Assert.expectThrows;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandel {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		driver.switchTo().window(child);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[class='im-para red']")));
		String email = driver.findElement(By.cssSelector("p[class='im-para red']")).getText();
		System.out.println(email);
		String emailId = email.split("at")[1].trim().split(" ")[0].split("@")[1];
		driver.switchTo().window(parent);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div/input[@name='username']")));
		driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys(emailId);
		}

}
