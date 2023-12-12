package New;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests {
	
	@Test
	public void Gs() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   	 WebDriver driver = new ChromeDriver();
	   	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   	 driver.manage().window().maximize();
	   	 driver.get("https://www.ilovepdf.com/");
	   	 
		
	}

}
