package base;

import factory.WebDriverInitializer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void startDriver(String browser) {
		driver = new WebDriverInitializer().initDriver(browser);
	}

	@AfterMethod
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

	public void openURL(String url){
	    driver.get(url);
    }

}
