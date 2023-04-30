package tutorialsninja_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	@BeforeTest
	public void website_opining() throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(co);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@Test
	public void login () throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(co);
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys("haseeb.aaram@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("haseeb1379813");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();
		Thread.sleep(2000);
		driver.quit();
		
		}	
	}
	
	

		

	
