package rahulsettyAcademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DroupdownWindowAndParticularTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		//scroll down particular table
		//js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		WebElement tableHeader = driver.findElement(By.cssSelector(".tableFixHead"));
		js.executeScript("arguments[0].scrollTop += 20;", tableHeader);
		List<WebElement> amount = driver.findElements(By.cssSelector("div.tableFixHead tbody tr td:nth-child(4)"));
		int sum = 0;
		for (int i = 0; i < amount.size(); i++) {
			int x = Integer.parseInt(amount.get(i).getText().trim());
				sum+=x;
		}
		System.out.println(sum);
		String totalAmount = driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim();
		int i = Integer.parseInt(totalAmount);
		Assert.assertEquals(sum, i);
		
	}

}
