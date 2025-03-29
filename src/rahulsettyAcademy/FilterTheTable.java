package rahulsettyAcademy;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class FilterTheTable {

	public void filter() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Rice");
		List<WebElement> veggies = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		List<WebElement> filterdList = veggies.stream().filter(s -> s.getText().contains("Rice")).sorted()
				.collect(Collectors.toList());
		Assert.assertEquals(veggies, filterdList);

	}

	@Test
	public void relativeLocators() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement nameEdt = driver.findElement(By.xpath("//div/input[@name='name']"));
		driver.findElement(with(By.tagName("label")).above(nameEdt));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEdt)).getText());
		WebElement password = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(password)).click();
		WebElement ice = driver.findElement(By.xpath("//label[contains(text(),'Check')]"));
		driver.findElement(with(By.tagName("input")).toLeftOf(ice)).click();
	
	}

}
