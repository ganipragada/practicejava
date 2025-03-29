package rahulsettyAcademy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenURLs {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 2000);");
		SoftAssert a = new SoftAssert();
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for (WebElement link : links) {
			System.out.println(link.getText());
			String url = link.getAttribute("href");
			System.out.println(url);
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int response = conn.getResponseCode();
			System.out.println(response);
			a.assertTrue(response < 400,"the url with text "+link.getText()+"is broken"+response);
		}
		a.assertAll();
	}

}
