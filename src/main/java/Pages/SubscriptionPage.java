package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SubscriptionPage {
	
	private WebDriver driver;
	
	public void SubscriptionPage(WebDriver driver) {
        this.driver = driver;
    }
	
	
	 public WebElement getSubscriptionPackage(String country, String packageName) {
	        String xpath = String.format("//div[@data-country='%s']//div[contains(text(),'%s')]", country, packageName);
	        return driver.findElement(By.xpath(xpath));
	 }
	 
	 public WebElement getSubscriptionPrice(String country, String packageName) {
	        String xpath = String.format("//div[@data-country='%s']//div[contains(text(),'%s')]/following-sibling::div", country, packageName);
	        return driver.findElement(By.xpath(xpath));
	    }

	    public WebElement getSubscriptionCurrency(String country, String packageName) {
	        String xpath = String.format("//div[@data-country='%s']//div[contains(text(),'%s')]/following-sibling::div/following-sibling::div", country, packageName);
	        return driver.findElement(By.xpath(xpath));
	    }

}
