import java.time.Duration;
import java.util.Arrays;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//explicit wait
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class= 'promoCode']")));
		driver.findElement(By.xpath("//input[@class= 'promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("Button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {

		int j = 0;
		//getting all 30 product names
		List<WebElement> productList = driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for (int i = 0; i <= productList.size(); i++) 
		{
			
			String[] extractedName = productList.get(i).getText().split("-");
			String productName = extractedName[0].trim();
			//format it to get actual vegetable name

			//convert array into array list for easy search

			//  check whether name you extracted is present in arrayList or not-
			List<String> listItem = Arrays.asList(itemsNeeded);
			
			if (listItem.contains(productName)) {

				j++;

				System.out.println(productName);
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//getting single item 3 times
				//driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
				if (j == itemsNeeded.length)

				{

					break;

				}
			}
		}
	}

}
