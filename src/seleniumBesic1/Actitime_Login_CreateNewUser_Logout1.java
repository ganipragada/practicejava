package seleniumBesic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actitime_Login_CreateNewUser_Logout1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("login actitime successfully!!");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		System.out.println("login successfully!!");
		
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("ganesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("pragada");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("gani123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("((//span[text()='Close'])[1])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
