import java.sql.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahul@gmail.com");	
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("945675678");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		
		String str = driver.findElement(By.className("infoMsg")).getText();
		String[] arr = str.split("'");
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		System.out.println("Trimmed value: " + list.get(1));
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.xpath("//input[@id='inputUsername']")).clear();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(list.get(1));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]"));
		driver.findElement(By.className("signInBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		System.out.println("App closing");
		driver.quit();
		System.out.println("App closed");
	}
}
