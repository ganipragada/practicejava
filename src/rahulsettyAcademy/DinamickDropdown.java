package rahulsettyAcademy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import com.google.common.io.Files;

public class DinamickDropdown {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		Robot ro = new Robot();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_SUBTRACT);
		ro.keyRelease(KeyEvent.VK_SUBTRACT);
		ro.keyPress(KeyEvent.VK_SUBTRACT);
		ro.keyRelease(KeyEvent.VK_SUBTRACT);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[3]/div/div/div")));
		WebElement fromAdd = driver.findElement(
				By.xpath("//div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[3]/div/div/div"));
		fromAdd.click();
		Thread.sleep(300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']")));
		List<WebElement> airpotsList = driver.findElements(
				By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']/div/div/div/div"));
		for (WebElement webElement : airpotsList) {
			String port = webElement.getText();
			System.out.println(port);
			if (port.equalsIgnoreCase("Vishakhapatnam")) {
				webElement.click();
				break;
			}
		}
		TakesScreenshot ts= (TakesScreenshot) driver ;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("");
		Files.copy(src, desc);

	}
}
