import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSortingUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on the "Veg/fruit" header and sort
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all webelements into list
		
		List<WebElement> elementList= driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all webelements into new list
		List<String> originalList= elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort in the original list of step 3 ->sortedList
		List<String> sortedList= originalList.stream().sorted().collect(Collectors.toList());
		
		//compare the original list vs sortedList
		Assert.assertEquals(originalList, sortedList);
		
		List<String>price;
		
		//getting the price for the corresponding veggies
		do{
			price= elementList.stream().filter(s->s.getText().contains("Beans"))
					.map(s->getVeggiePrice(s)).collect(Collectors.toList());
					price.forEach(a-> System.out.println(a));
		
			if(price.size()>1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}while(price.size()<1); 
	}


	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
