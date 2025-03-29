package rahulsettyAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIsSelectedOrNot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkBoxes = driver.findElement(By.xpath("(//div[@class='right-align'])[1]"));
		System.out.println(checkBoxes.findElement(By.xpath("(//label/input)[4]")).isSelected());
		checkBoxes.findElement(By.xpath("(//label/input)[4]")).click();
		System.out.println(checkBoxes.findElement(By.xpath("(//label/input)[4]")).isSelected());
}

}
