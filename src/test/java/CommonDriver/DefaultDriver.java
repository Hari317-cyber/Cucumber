package CommonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.logging.Logger;

public class DefaultDriver {
    private static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        if(System.getProperty("Browser") == null){
            browser="chrome";
        }
        else{
            browser=System.getProperty("Browser");
        }

        if (driver == null) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid browser specified: " + browser);
            }
        }
        return driver;
    }
}
