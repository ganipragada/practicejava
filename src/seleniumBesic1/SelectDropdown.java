package seleniumBesic1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement select = driver
				.findElement(By.xpath("//select[@id='dropdown-class-example' and @name='dropdown-class-example']"));
		Select s1 = new Select(select);
		s1.selectByIndex(1);
		System.out.println(s1.getFirstSelectedOption().getText());
		s1.selectByValue("option2");
		System.out.println(s1.getFirstSelectedOption().getText());
		s1.selectByVisibleText("Option3");
		System.out.println(s1.getFirstSelectedOption().getText());
		driver.close();

	}

}
