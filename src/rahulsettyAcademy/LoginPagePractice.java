package rahulsettyAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePractice {
	public static String getUsername(WebDriver driver) {
		String username = driver.findElement(By.xpath("//div/p/b[1]")).getText();
		return username;
	}

	public static String getPassword(WebDriver driver) {
		String password = driver.findElement(By.xpath("//div/p/b[2]")).getText();
		return password;

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		String username = getUsername(driver);
		String password = getPassword(driver);
		driver.findElement(By.xpath("//div[@class='form-group'][1]/input")).sendKeys(username);
		driver.findElement(By.xpath("//div[@class='form-group'][2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//label[2]/span[@class='checkmark']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select sl = new Select(dropdown);
		sl.selectByIndex(2);

	}

}
