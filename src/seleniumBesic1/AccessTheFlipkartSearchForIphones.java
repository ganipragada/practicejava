package seleniumBesic1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessTheFlipkartSearchForIphones {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement search = driver.findElement(By.cssSelector("input.Pke_EE"));
		search.sendKeys("iphone11");
		search.submit();
		List<WebElement> pNames = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> pPrices = driver.findElements(By.xpath("//div[@class=\'Nx9bqj _4b5DiR\']"));

		/*
		 * for (WebElement element : pNames) { String pname = element.getText();
		 * System.out.println(pname);
		 * 
		 * } for (WebElement element : pPrices) { String price = element.getText();
		 * System.out.println(price);
		 * 
		 * }
		 */
		for (int i = 0; i < pNames.size(); i++) {
			System.out.println(pNames.get(i).getText() + " = " + pPrices.get(i).getText());
		}
		driver.close();
	}

}
