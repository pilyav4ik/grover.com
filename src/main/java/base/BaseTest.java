package base;

import factory.WebDriverInitializer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.Properties;

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
	

}
