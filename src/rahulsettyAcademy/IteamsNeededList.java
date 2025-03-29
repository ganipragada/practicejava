package rahulsettyAcademy;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.reactivex.rxjava3.functions.Action;

public class IteamsNeededList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] itemsNeeded = { "Brocolli", "Cucumber", "Potato" };
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		iteamsList(driver, itemsNeeded);

	}

	private static void iteamsList(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> itemsList = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < itemsList.size(); i++) {
			String[] name = itemsList.get(i).getText().split("-");
			String formatedName = name[0].trim();
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formatedName)) {
				j++;
				System.out.println(formatedName);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			if (j == itemsNeeded.length) {
				break;
			}
		}

	}

}
