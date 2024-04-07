package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void testLocators() throws InterruptedException {
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		// Upload file
		//If the tag is input, use .sendkeys
		//If the tag is anything else other than input, use Robot class
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\imena\\Desktop\\Selenium\\SESSIONS\\Session 1.pptx");
		
		//link text
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("TF-API")).click();
		driver.navigate().back();
		
		//css Locator
		driver.findElement(By.cssSelector("input#sex-1")).click();
		driver.findElement(By.cssSelector("input[id='profession-1'] ")).click();
		driver.findElement(By.cssSelector("driver.findElement(By.cssSelector(\"input[id='profession-1'] \")).click();")).click();
		driver.findElement(By.cssSelector("a[href$='http://techfios.com/api-prod/api/'] ")).click();	
		
		//xpath
		//do it later the last two
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("is fun");
		//most used
		driver.findElement(By.name("//input[@name='lastname']")).sendKeys("is fun");
		
		driver.findElement(By.xpath("driver.findElement(By.xpath(\"html/body/div/div[2]/div[2]/form/div[10]/input\")).sendKeys(\"is fun\");")).click();
		driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
		//most used because of the word contains instead of equal signs
		driver.findElement(By.xpath("//strong[contains (text(), 'Link Test : Page Change')]")).click();
		
		
		//Xpath Axes
		
	}
}
