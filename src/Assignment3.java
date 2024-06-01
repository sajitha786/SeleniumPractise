import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		
		//extracting the username and password
		String username= driver.findElement(By.xpath("(//i[normalize-space()='rahulshettyacademy'])")).getText();
		System.out.println(username);
		String password= driver.findElement(By.xpath("(//i[normalize-space()='learning'])")).getText();
		System.out.println(password);
		
		//Inputting username and password
		driver.findElement(By.xpath("(//input[@id= \"username\"])")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		//selection the radio button
		driver.findElement(By.cssSelector("input[value='user']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		
		//selecting the dropdown
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@data-style='btn-info']")));
		sel1.selectByIndex(2);
		
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.cssSelector("input#signInBtn")).click();
		w.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
		
		//Finding total count of add button in the page		
		List <WebElement> addBtnCount = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		System.out.println("Total Add button count is: " + addBtnCount.size());
		//Add items to cart
		for(int i=0;i<addBtnCount.size(); i++) {
			addBtnCount.get(i).click();
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	}
	
}
