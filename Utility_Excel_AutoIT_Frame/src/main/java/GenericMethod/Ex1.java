package GenericMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.LoginPage;

public class Ex1 {

	public static WebDriver driver;
	public WebElement element;
	public  static  void setEmail(String uName) {
		driver.findElement(By.id("email")).sendKeys(uName);
	}

   public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
		//pageObjRef= new LoginPage(driver);
		driver.get("file:///F:/JBK/software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	    Ex1.setEmail("kiran@gmail.com");
	}
	
}
