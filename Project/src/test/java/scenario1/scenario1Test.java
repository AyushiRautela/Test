package scenario1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class scenario1Test {
   
	WebDriver driver;
	
	@Test
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("Http://google.Com/");
		
	}
	
}
