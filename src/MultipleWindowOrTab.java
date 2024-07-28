import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowOrTab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//invoking new TAB
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//invoking new WINDOW
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		driver.switchTo().window(childWindowID);
		
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
		.get(1).getText();
		
		driver.switchTo().window(parentWindowID);
		WebElement nameTextBox= driver.findElement(By.cssSelector("[name='name']"));
		nameTextBox.sendKeys(courseName);
		
		File fileSrc= nameTextBox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fileSrc, new File("nameTextBox.png"));
		
		System.out.println(nameTextBox.getRect().getDimension().getHeight());
		System.out.println(nameTextBox.getRect().getDimension().getWidth());
		driver.quit();
	}

}
