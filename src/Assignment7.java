import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		//Total no of rows
		System.out.println("Total no. of rows :"+driver.findElements(By.cssSelector(".table-display tbody tr")).size());
		//Total no. of columns
		System.out.println("Total no. of coloumns :"+driver.findElements(By.cssSelector(".table-display tbody tr:nth-child(2)")).size());
		
	}
}
