import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement e = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(e);
		System.out.println(driver.findElement(By.id("draggable")).isDisplayed());
		Actions act= new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
	}

}
