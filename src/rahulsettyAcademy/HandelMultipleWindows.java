package rahulsettyAcademy;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandelMultipleWindows {
	@Test
	public void multipleWindows() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='example']/a")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		Thread.sleep(2000);
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		driver.switchTo().window(parent);

	}

}
