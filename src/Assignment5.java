import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());//size=2
		//frame-top
		WebElement fTop= driver.findElement(By.cssSelector("frame[name='frame-top']"));
		//switching to frame-top
		driver.switchTo().frame(fTop);
		//switching to middle frame
		driver.switchTo().frame("frame-middle");
		//Printing Middle
		String middleFrame= driver.findElement(By.tagName("body")).getText(); 
		System.out.println(middleFrame);
	}

}
