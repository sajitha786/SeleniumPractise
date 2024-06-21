import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxWindowAndDeleteCookies {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");
		//click on any link, it will redirect to login page
		//As the session is deleted. thus we can verify login functionality
		driver.get("https://www.google.com/");
	}
}
