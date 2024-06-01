import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		
		//selecting destination from BLR to Chennai
		//driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
		
		//selecting destination from Chennai to BLR
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[contains(text(),'MAA')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
		
				
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[56]")).click();
		WebElement element = driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[13]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		
		driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-eu3ka r-1otgn73 r-1aockid')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-eu3ka r-1otgn73 r-1aockid')]")).getText());
		
//		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55'])[3]/div[@data-testid='undefined-calendar-day-14']")).click();
//		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55'])[3]/div[@data-testid='undefined-calendar-day-14']")).getText());
		
		
		
	}
	
}