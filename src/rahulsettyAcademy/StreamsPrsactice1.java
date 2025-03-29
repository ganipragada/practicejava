package rahulsettyAcademy;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class StreamsPrsactice1 {
	@Test
	public void fatchMoteThen4LettersStringList() {
		Stream<String> names = Stream.of("gani", "raju", "ramesh", "praveen", "prabhas", "prabhas", "prbbhas",
				"paabhas");
		names.filter(s -> s.length() < 8 && s.length() > 6).filter(s -> s.startsWith("p")).filter(s -> s.endsWith("s"))
				.sorted(Comparator.reverseOrder()).distinct().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
	}

@Test
	public void rahul() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// login to the officeal vebsite
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// maximize the window
		driver.manage().window().maximize();
		//given wait implisitly
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//tr/th[1]")).click();		//collect all the vegitable 
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originalList = elementList.stream().map(s-> s.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		//Assert.assertTrue(originalList.equals(sortedList));
		
		
		List<String> price;
	do {
		price = elementList.stream().filter(s-> s.getText().contains("Rice")).map(s-> getPrice(s)).collect(Collectors.toList());
	} while (price.size()<1);
	
}
	public static String getPrice(WebElement element) {
		String priceValue = element.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
		
	}
	
}

