package rahulsettyAcademy;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class PageScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		@Nullable
		String title = driver.getTitle();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File(".\\ScreenshotFolder" + title +".png");
		Files.copy(src, des);
	}

}
