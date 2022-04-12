package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import settings.WebDriverSettings;

import java.time.Duration;

public class WebDriverInitializer {

    WebDriver driver;
    private WebDriverSettings webDriverSettings = new WebDriverSettings();

    @Parameters("browser")
    public WebDriver initDriver(String browser){
        if (browser.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(webDriverSettings.getImplicitlyWait()));
        }else if (browser.equalsIgnoreCase("Chrome headless")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(true);
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(webDriverSettings.getImplicitlyWait()));
        }else if (browser.equalsIgnoreCase("FF")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(webDriverSettings.getImplicitlyWait()));
        }

        return driver;

    }
}
