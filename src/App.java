package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App
{
    public static void main( String[] args )
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=D:\\tmp\\User Data");
        options.addArguments("--profile-directory=Profiel1");
        options.addArguments("--lang=en");
        String path = "D:\\tmp\\driver\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);

        WebDriver driver = new ChromeDriver(options);
        driver.get("chrome://version");
        //driver.quit();
    }
}