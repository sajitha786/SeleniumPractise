import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2EAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		//Name
		driver.findElement(By.xpath("//input[@name='name'][1]")).sendKeys("Sajitha");
		//email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		//password
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Pass123");
		//check box
		driver.findElement(By.id("exampleCheck1")).click();
		//drop down
		Thread.sleep(2000L);
		Select objSelect = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		List<WebElement> element=objSelect.getOptions();
		System.out.println(element.get(1).getText());
		element.get(1).click();
		System.out.println(element.get(1).isSelected());
		//radio button
		driver.findElement(By.xpath("//input[@id='inlineRadio1'][contains(@value,'option1')]")).click();
		//date picker
		driver.findElement(By.xpath("//input[@name='bday'][@type='date']")).sendKeys("12/10/2024");
		//click the submit button
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		String message = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		Assert.assertEquals(message,"� Success! The Form has been submitted successfully!.");
	}

}
		