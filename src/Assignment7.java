import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		//Total no of rows
		List<WebElement> rows = driver.findElements(By.cssSelector(".table-display tbody tr"));
		System.out.println("Total no. of rows :"+rows.size());
		//Total no. of columns
		List<WebElement> cols= driver.findElements(By.xpath("//div[@class='left-align']//table//tbody//th"));
		System.out.println("Total no. of coloumns : "+ cols.size());
		//Getting the 
		List <WebElement> cntnt = driver.findElements(By.xpath("//div[@class='left-align']//table//tbody//tr[3]"));
		for(WebElement cntntList:cntnt)
		    System.out.println(cntntList.getText());
		
		driver.close();
	}
}
