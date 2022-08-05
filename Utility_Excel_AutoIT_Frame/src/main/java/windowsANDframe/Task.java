package windowsANDframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task {
	@Test
	public void redbus() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriverAutoIT.exe"); // chromedriver 
		WebDriver wd = new ChromeDriver();                                       // chrome open 
		wd.get("https://www.redbus.in/");                                        // website open 
		wd.manage().window().maximize();                                         // maximize
		wd.findElement(By.id("sign-in-icon-down")).click();                      // click login tab
		wd.findElement(By.id("hc")).click();
		Thread.sleep(5000);
		
		// switching to I-Frame 
		
		wd.switchTo().frame(wd.findElement(By.xpath("*//iframe[@class=\"modalIframe\"]"))); // iframe switch 
		Thread.sleep(3000);
		wd.findElement(By.xpath("*//input[@id='mobileNoInp']")).sendKeys("123456");
		wd.findElement(By.id("newFbId")).click();                                            // fb tab 
		
		// switching to facebook window 
		
		Thread.sleep(10000);                                                   // fb window 
		for (String a : wd.getWindowHandles()) {
			wd.switchTo().window(a);
 
		}
		//entering the email and pass in fb login
		Thread.sleep(3000);
		wd.findElement(By.id("email")).sendKeys("kiran@gmail.com"); //email 
		wd.findElement(By.id("pass")).sendKeys("123456");           // pass

	}
}
