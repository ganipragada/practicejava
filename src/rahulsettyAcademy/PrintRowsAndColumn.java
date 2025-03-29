package rahulsettyAcademy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintRowsAndColumn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800);");
		// print number of rows
		System.out.println(driver.findElements(By.xpath("//fieldset/table[@id='product']/tbody/tr/th")).size());
		// print number of column
		System.out.println(driver.findElements(By.xpath("//td[contains(text(),'Rahul Shetty')]")).size());

		// We fatch row and column count with using element
		WebElement table = driver.findElement(By.xpath("//fieldset/table"));
		// print the rows for the particular table
		System.out.println(table.findElements(By.tagName("tr")).size() - 1);
		// print the columns for the particular table
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("td")).size());
		//print secound row of the table
		List<WebElement> secoudRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secoudRow.get(0).getText());
		System.out.println(secoudRow.get(1).getText());
		System.out.println(secoudRow.get(2).getText());
	
	
	}

}
