package tutorialsninja_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Search_Product {

		
		@Test
		public void login () throws InterruptedException {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://tutorialsninja.com/demo");
	driver.findElement(By.name("search")).sendKeys("iphone");
	driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();

	}

}
