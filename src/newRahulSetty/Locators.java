package newRahulSetty;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   driver.get("");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  

	}
}
