import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Locators3 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name= "rahul";
		//WebDriver driver  = new EdgeDriver();
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[2]/preceding-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[2]/parent::div")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[2]/parent::div")).getText());
		
	}

}
