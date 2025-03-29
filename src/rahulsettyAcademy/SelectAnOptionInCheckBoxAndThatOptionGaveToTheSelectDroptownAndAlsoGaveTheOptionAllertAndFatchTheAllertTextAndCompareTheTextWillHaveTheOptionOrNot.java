package rahulsettyAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SelectAnOptionInCheckBoxAndThatOptionGaveToTheSelectDroptownAndAlsoGaveTheOptionAllertAndFatchTheAllertTextAndCompareTheTextWillHaveTheOptionOrNot {

	public static void main(String[] args) {
		//Open the chrome browser
		WebDriver driver = new ChromeDriver();
		//Gave the some implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//Maximize the window
		driver.manage().window().maximize();
		//navigate to the url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Select the option with check box
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		//grap the option text
		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		//print the text
		System.out.println(opt);
		
		//take the paticular dropdown element
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		//create the object of select class with element argumant
		Select s = new Select(dropdown);
		//Select the option with using visible text
		s.selectByVisibleText(opt);
		
		
		//enter the value into swech to alert text box
		driver.findElement(By.cssSelector("[id='name']")).sendKeys(opt);
		//click the alert button
		driver.findElement(By.id("alertbtn")).click();
		//grab the alert text
		String alertText = driver.switchTo().alert().getText();
		//compare the alert have contains the given sting or not
		Assert.assertTrue(alertText.contains(opt));

	}

}
