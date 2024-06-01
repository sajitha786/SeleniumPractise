import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class UpdatedDropDown {

	@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//Selecting Passengers
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		Thread.sleep(2000L);
		//getting the default passengers
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		int i = 1;
		while (i<5) {
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		i++;
		}
		//getting the selected passenger count
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		//Clicking done button inside the dropdown
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		Thread.sleep(2000L);
		
		System.out.println("***************");
		Assert.assertFalse(driver.findElement(By.xpath("(//div[contains(@style,'margin-right: 6px;')])[2]")).isSelected());
		System.out.println(driver.findElement(By.xpath("(//div[contains(@style,'margin-right: 6px;')])[2]")).isSelected());
		System.out.println("***************");
		
//		String xpath = "(//*[name()='svg'][@data-testid='svg-img'])[18]";
		String xpath= "(//div[contains(@style,'margin-right: 6px;')])[2]";
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
//		Actions act = new Actions(driver);
//		act.moveToElement(element).click().build().perform();
	  //Assert.assertFalse(driver.findElement(By.xpath("(//div[contains(@style,'margin-right: 6px;')])[2]")).isSelected());
		
		System.out.println("---------------");
		//Assert.assertTrue(element.isSelected());
		System.out.println(driver.findElement(By.xpath("(//div[contains(@style,'margin-right: 6px;')])[2]")).isSelected());
		System.out.println(element.isSelected());
		System.out.println("---------------");
		
		
		
		
  //	System.out.println(driver.findElement(By.xpath("(//div[contains(@style,'margin-right: 6px;')])[2]")).isSelected());
  //	Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(@style,'margin-right: 6px;')])[2]")).isSelected());
		
//		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73'])[2]")).getText());
		
		//getting count
//		System.out.println(driver.findElements(By.cssSelector("div[class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73'] div[class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa']")).size());
		//driver.findElement(By.cssSelector("div[data-testid$='home-page-flight-cta']")).click();
		
		
		
	}
}