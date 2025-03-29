package rahulsettyAcademy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name = driver.findElement(By.xpath("//div[@class='form-group'][3]"));
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".\\ScreenshotFolder\\elementScreenshot.png"));
		WebElement name2 = driver.findElement(By.name("name"));
		float height = name2.getRect().getDimension().getHeight();
		System.out.println(height);
		float width = name2.getRect().getDimension().getWidth();
		System.out.println(width);
	}

}
