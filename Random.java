import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/"); //https://www.youtube.com/results?search_query=fgteev
		driver.findElement(By.xpath("//div[@id='search-input']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("fgteev");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	}

}
