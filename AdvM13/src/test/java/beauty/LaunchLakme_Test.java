package beauty;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchLakme_Test {

	@Test
	public void lakme() {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.lakmeindia.com/");
		String url = System.getProperty("url");
		driver.get(url);
		driver.quit();
	}
}
