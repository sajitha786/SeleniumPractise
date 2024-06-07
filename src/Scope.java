import java.util.Iterator;
import java.util.Set;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Total count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Total counts of links in the footer section
		WebElement footerdriver= driver.findElement(By.id("gf-BIG")); //limiting the webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//Total counts of links in the 1st table section in footer
		WebElement tabledriver= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(tabledriver.findElements(By.tagName("a")).size());
		//click on each link in the column and check if the pages are opening:
		for (int i=1; i< tabledriver.findElements(By.tagName("a")).size();i++) {
			
			String clickonlinktab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			tabledriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000L);
			
		}//open all the tabs
			Set<String> str= driver.getWindowHandles();
			Iterator <String> it= str.iterator();
			
					while(it.hasNext()) {
						driver.switchTo().window(it.next());
						System.out.println(driver.getTitle());
					}
			
		}
	}
