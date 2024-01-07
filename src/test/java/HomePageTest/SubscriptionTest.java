package HomePageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.SubscriptionPage;

public class SubscriptionTest {
    private WebDriver driver;
    private SubscriptionPage subscriptionPage;

    @BeforeClass
    public void setUp() {
       
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();

        
        subscriptionPage = new SubscriptionPage();

        
        driver.get("https://subscribe.stctv.com/");
    }

    @Test
    public void validateSubscriptionPackages() {
        
        String[] countries = {"Country1", "Country2", "Country3"};
        String[] packageNames = {"Package1", "Package2", "Package3"};

        for (String country : countries) {
            for (String packageName : packageNames) {
                String price = subscriptionPage.getSubscriptionPrice(country, packageName).getText();
                String currency = subscriptionPage.getSubscriptionCurrency(country, packageName).getText();

      
            }
        }
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}