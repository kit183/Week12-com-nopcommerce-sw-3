package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseURL) {
        ChromeOptions options = new ChromeOptions();

        //Start Chrome browser
        driver = new ChromeDriver();
        //Launch the URL
        driver.get(baseURL);
        //Maximize window
        driver.manage().window().maximize();
        //Timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser() {
        driver.quit();
    }
}
