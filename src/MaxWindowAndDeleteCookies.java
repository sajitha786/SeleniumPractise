import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxWindowAndDeleteCookies {
	
	public static void main(String[] args) throws IOException, InterruptedException {
			// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");
		//click on any link, it will redirect to login page
		//As the session is deleted. thus we can verify login functionality
		driver.get("https://www.google.com/");
		
		//takingScreenshots
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\Screenshots\\screenshot1.png"));
		
		Thread.sleep(2000);
		driver.close();
	}
}
