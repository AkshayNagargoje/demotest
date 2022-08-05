package wait_forwardBack_TakeScreenShot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back_And_Forward {
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	//
}
}
