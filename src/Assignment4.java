import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		//Home Page
		driver.get("https://the-internet.herokuapp.com/");
		//first window
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		//second window
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		Set <String> wndw= driver.getWindowHandles();
		Iterator<String> it = wndw.iterator();
		String firstWndw= it.next();
		String secondWndw = it.next();
		//switching to second window
		driver.switchTo().window(secondWndw);
		//extracting the "New Window" text
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		//switching to first window
		driver.switchTo().window(firstWndw);
		//extracting the "Opening a new window" text
		System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
	}

}
