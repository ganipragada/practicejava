package rahulsettyAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul", Keys.TAB, "hello1213", Keys.ENTER);
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		driver.findElement(By.partialLinkText("Forgot your")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("ganendra", Keys.TAB,
				"ganendralnf eoiru vei", Keys.TAB, "5623978456");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("ganendra123@gmail.com", Keys.ENTER);
		
	}

}
