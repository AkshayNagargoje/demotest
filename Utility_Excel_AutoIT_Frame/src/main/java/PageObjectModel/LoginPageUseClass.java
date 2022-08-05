package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageUseClass {
public WebDriver driver;
public LoginPage pageObjRef;

@Test
public void loginPage() throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver= new ChromeDriver();
	pageObjRef= new LoginPage(driver);
	driver.get("file:///F:/JBK/software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
    pageObjRef.SetEmail("kiran@gmail.com");
    pageObjRef.SetPassord("123456");
    pageObjRef.clickLoginButton();
    Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
    Thread.sleep(2000);
    driver.close();
    
}
@Test
public void clickUser() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver= new ChromeDriver();
	pageObjRef= new LoginPage(driver);
	driver.get("file:///F:/JBK/software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	 pageObjRef.SetEmail("kiran@gmail.com");
	    pageObjRef.SetPassord("123456");
	    pageObjRef.clickLoginButton();
	    pageObjRef.clickUser();
}
}
