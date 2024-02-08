import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[contains(text(),'MAA')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
		
	}

}
