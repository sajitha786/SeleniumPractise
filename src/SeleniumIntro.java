import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoke chromedriver
		System.setProperty("webdriver.chrome.driver", "D:/Testing/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println("Title of the webpage: " + driver.getTitle());
		System.out.println("Current Url: " + driver.getCurrentUrl());
//		driver.close();
		driver.quit();
	}

}