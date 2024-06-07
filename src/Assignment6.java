import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//clicking the checkbox
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		//getting the text of the checkbox
		String name=driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println("name "+name);
		//Selecting the dropdown options based on selected checkbox option text
		WebElement selectOption = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select select= new Select(selectOption);
		select.selectByVisibleText(name);
		//printing name as alert
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String popupText=driver.switchTo().alert().getText();
		Thread.sleep(5000L);
		//Verifying alert
		if(popupText.contains(name))
			System.out.println(name+" is present in popup."); 
		driver.switchTo().alert().dismiss();
		driver.close();
	}

}
