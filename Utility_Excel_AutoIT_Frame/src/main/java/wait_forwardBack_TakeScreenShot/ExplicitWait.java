package wait_forwardBack_TakeScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
// webdriver wait is  key wrd for Explicit wait 
// Explicit wait utility method 
	public static  void mySendKeys(WebDriver driver,WebElement element,int timeout,String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	
	}
	
	public static void myClick(WebDriver driver, WebElement element, int timout) {
		new WebDriverWait(driver, timout).until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
}
