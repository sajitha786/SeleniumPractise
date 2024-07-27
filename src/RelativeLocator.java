import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox= driver.findElement(By.cssSelector("[name='name']"));
		//by.tagName-- above
		String nameText= driver.findElement(with(By.tagName("Label")).above(nameEditBox)).getText();
		System.out.println(nameText);
		//by.input-- below
		WebElement dateLabelBox= driver.findElement(By.cssSelector("Label[for='dateofBirth']"));
		String dateText= driver.findElement(with(By.tagName("input")).below(dateLabelBox)).getText();
		System.out.println(dateText); // it wont display as it is a flex
		//by.input-- toLeftOf
		WebElement chkDescription=driver.findElement(By.cssSelector("[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(chkDescription)).click();
		//by.input-- toRightOf
		WebElement radio1Element = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radio1Element)).getText());
		driver.findElement(with(By.tagName("label")).toRightOf(radio1Element)).click();

}
}
