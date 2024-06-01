import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class E2eSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// get url
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		// selecting one way trip
		// driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[10]")).click();

		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(2000L);
		// select Delhi
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[contains(text(),'DEL')]"))
				.click();
		Thread.sleep(2000L);
		// select Chennai
		driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
		// select departure date
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[56]")).click();
		WebElement element = driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[13]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(2000L);
		System.out.println("hi " + driver.findElement(By.xpath(
				"//div[contains(@class,'css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu')]"))
				.getText());
		// System.out.println(driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n
		Thread.sleep(2000L);
		driver.findElement(By.xpath(
				"//div[contains(@class,'css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu')]"))
				.click();
		// driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy
		// r-16ru68a r-pm2fo r-1hd4d43 r-y47klf r-ou6ah9 r-cqzzvf r-1loqt21 r-eu3ka
		// r-1otgn73 r-1aockid')]")).click();
		Thread.sleep(2000L);
//		//select return date

		System.out.println(driver.findElement(By.xpath(
				"//div[contains(@class,'css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73')]"))
				.isEnabled());
		driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[11]")).click();

		System.out.println(driver.findElement(By.xpath(
				"//div[contains(@class,'css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73')]"))
				.isEnabled());

		System.out.println("style1 " + driver.findElement(By.xpath(
				"//div[contains(@class,'css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73')]"))
				.getAttribute("style"));
		driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[10]")).click();
		System.out.println("style2 " + driver.findElement(By.xpath(
				"//div[contains(@class,'css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73')]"))
				.getAttribute("style"));

		if (driver.findElement(By.xpath(
				"//div[contains(@class,'css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73')]"))
				.getAttribute("class").contains("r-14lw9ot")) {
			System.out.println("its disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// Selecting Passengers
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		Thread.sleep(2000L);
		// getting the default passengers
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		int i = 1;
		while (i < 4) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}
		// getting the selected passenger count
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		// Clicking done button inside the dropdown
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		Thread.sleep(2000L);

		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[66]")).click();
		driver.findElement(By.xpath("//div[@data-testid= 'home-page-flight-cta']")).click();
		Thread.sleep(2000L);

		// select the check box for terms and conditions
		driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[9]")).click();
		// click on the continue button
		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]"))
				.click();
	}

}
