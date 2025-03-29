package rahulsettyAcademy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelCheckBoxAndGettingSigeOfThem {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Robot ro = new Robot();
		for (int i = 0; i < 5; i++) {
			ro.keyPress(KeyEvent.VK_CONTROL);
			ro.keyPress(KeyEvent.VK_SUBTRACT);
			ro.keyRelease(KeyEvent.VK_SUBTRACT);
			ro.keyRelease(KeyEvent.VK_CONTROL);
		}
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).getSize());
		

	}

}
