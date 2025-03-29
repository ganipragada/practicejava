package seleniumBesic1;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesionHandling1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("virat kohli");
		Thread.sleep(3000);
		List<WebElement> suggesions = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		
		for(WebElement element: suggesions) {
			System.out.println(element.getText());
		}
		
		/*Iterator<WebElement> element = suggesions.iterator();
		while (element.hasNext()) {
			System.out.println(element.next().getText());
		}*/
		driver.close();
	}
}
