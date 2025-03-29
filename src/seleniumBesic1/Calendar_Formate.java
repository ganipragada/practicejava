package seleniumBesic1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Formate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		Calendar cl = Calendar.getInstance();
		cl.add(Calendar.DAY_OF_YEAR,1);
		Date d = cl.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String formate = sdf.format(d);
		System.out.println(formate);
		driver.findElement(By.className("hasDatepicker")).sendKeys(formate);
		Thread.sleep(30000);
		driver.close();
	}

}
