
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Approach 1
		WebDriver driver = new ChromeDriver();
		String str1 = "Uni";
		String value= "United Kingdom (UK)";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement drpDown = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		drpDown.sendKeys(str1);
		Thread.sleep(5000);

		WebElement drpdwnList = driver.findElement(By.xpath("//ul[@id='ui-id-1']"));

		List<WebElement> optList = drpdwnList.findElements(By.tagName("li"));

		for (WebElement option : optList) {
			String word = option.getText();
			System.out.println(word);
			if (word.equalsIgnoreCase(value)) {
				Assert.assertEquals(value, word);
				option.click();
				break;
			}

		}
		
		//Approach 2

		Thread.sleep(2000);
		drpDown.clear();
		drpDown.sendKeys("ind");
		Thread.sleep(2000);
		drpDown.sendKeys(Keys.DOWN);
		drpDown.sendKeys(Keys.DOWN);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript(drpDown.getAttribute("value"));
		
		
		Thread.sleep(2000);
		 driver.quit();
		 //Approach 3 is in Assignment8Solution class
	}
}