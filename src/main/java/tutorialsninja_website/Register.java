package tutorialsninja_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Register {

		
		@Test
		public void login () throws InterruptedException {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://tutorialsninja.com/demo");
			
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
			driver.findElement(By.id("input-firstname")).sendKeys("Haseebullah");
			driver.findElement(By.id("input-lastname")).sendKeys("Aaram");
			driver.findElement(By.id("input-email")).sendKeys("Haseebullah.aaram@gmail.com");
			driver.findElement(By.id("input-telephone")).sendKeys("1234567891");
			driver.findElement(By.id("input-password")).sendKeys("haseeb10");
			driver.findElement(By.id("input-confirm")).sendKeys("haseeb10");
			driver.findElement(By.name("agree")).click();
			driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
			Thread.sleep(5000);
			driver.quit();

	}

}
