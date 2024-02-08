import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("ind");
		Thread.sleep(2000);
		//List<WebElement> options =driver.findElements(By.xpath("(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all'])[1]//a"));
		List<WebElement> options=driver.findElements(By.cssSelector("ul[class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all'] a"));
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
	}

}
