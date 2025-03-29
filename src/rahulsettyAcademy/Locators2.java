package rahulsettyAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Locators2 {
	public String password(WebDriver driver, WebDriverWait wait) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//div[@class='forgot-pwd-container']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".reset-pwd-btn")));
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String fullText = driver.findElement(By.cssSelector("form p")).getText();
		String[] trim = fullText.split("'");
		String password = trim[1].split("'")[0];
		driver.findElement(By.xpath("//button[contains(text(), 'to Login')]")).click();
		return password;
	}

	public static void main(String[] args) throws InterruptedException {
		String url = "https://rahulshettyacademy.com/locatorspractice/";
		String name = "rahul";
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Locators2 l2 = new Locators2();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String password = l2.password(driver, wait);
		System.out.println(password);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name,Keys.TAB,password);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+name+",");
		driver.findElement(By.cssSelector(".logout-btn")).click();
		System.out.println("logout successfully");
		driver.close();	}

}
