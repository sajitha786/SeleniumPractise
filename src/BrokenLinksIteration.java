import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinksIteration {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1750)");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a =new SoftAssert();
		
		for(WebElement link : links) {
			String url1= link.getAttribute("href");
			//connecting the url to get response code
			
			HttpURLConnection con= (HttpURLConnection)new URL(url1).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int respCode= con.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400, "The Link with text " + link.getText()+" is broken with response code "+ respCode);

		}
		a.assertAll();
		
		
		
		
		driver.close();
	}

}
