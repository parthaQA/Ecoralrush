package Base;

import com.Utility.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {


   protected static WebDriver driver;

    @BeforeMethod
    public void browserSetup()
    {
        driver= BrowserFactory.startBrowser("chrome","http://ecom.coralrush.com/");


    }


    @AfterMethod
    public void closeBrowser()
    {
        driver.quit();
    }
}


