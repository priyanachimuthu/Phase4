package Amazon_pkg;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//import org.openqa.selenium.By;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.SessionId;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

//import io.appium.java_client.MobileElement;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.functions.ExpectedCondition;
//import io.appium.java_client.touch.offset.PointOption;

public class Amazon_docker {
    public static void main(String[] args) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Appium_Workspace\\Amazon_project\\chromedriver.exe");
        
    // WebDriver driver = new ChromeDriver();
        URL URL = new URL("http://localhost:4444/wd/hub");
        ChromeOptions options = new ChromeOptions();
        
        WebDriver driver = new RemoteWebDriver(URL, options);
        driver.get("https://www.swiggy.com");
        System.out.println(driver.getTitle());
    }
}
