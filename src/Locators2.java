import java.time.Duration;

import javax.xml.xpath.XPath;

import org.checkerframework.dataflow.qual.AssertMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name= "rahul";
		System.setProperty("webdriver.chrome.driver", "D:/Testing/Selenium/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		String actualPara= 	driver.findElement(By.xpath("//div/p")).getText();
		System.out.println(actualPara);
		String expectedPara= "You are successfully logged in.";
		Assert.assertEquals(actualPara, expectedPara);
		
		Assert.assertEquals(driver.findElement(By.xpath("//h2[1]")).getText(), "Hello "+name+",");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		
	}

}