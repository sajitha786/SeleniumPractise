import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1750)");
		
		String url= driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		String url1=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		//connecting the url to get response code
		HttpURLConnection con= (HttpURLConnection)new URL(url1).openConnection();
		con.setRequestMethod("HEAD");
		con.connect();
		int respCode= con.getResponseCode();
		System.out.println(respCode);
		

		driver.close();
	}

}
