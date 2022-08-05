package Log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage;

public class ex1 {
	@Test
	public void test() {
		Logger log = Logger.getLogger(ex1.class);
		PropertyConfigurator.configure("log4j.properties");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.info("browser start");
		// PageObjectModel.LoginPage pageObjRef= new LoginPage(driver);
		LoginPage pageObjRef = new LoginPage(driver);
		log.info("connected to the page object model");

		driver.get("file:///F:/JBK/software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		log.info("open website and enter credential ");
		pageObjRef.SetEmail("kiran@gmail.com");
		pageObjRef.SetPassord("123456");
		log.info("clicck login button");
		pageObjRef.clickLoginButton();
		
		
		/*
		 * #Set level log4j.rootCategory=debug, console, file
		 * 
		 * # Appender which writes to console
		 * log4j.appender.console=org.apache.log4j.ConsoleAppender
		 * log4j.appender.console.layout=org.apache.log4j.PatternLayout
		 * log4j.appender.console.layout.ConversionPattern=%d{MM-dd-yyyy HH:mm:ss} %F
		 * %-5p [%t] %c{2} %L - %m%n
		 * 
		 * # Appender which writes to a file
		 * log4j.appender.file=org.apache.log4j.RollingFileAppender
		 * log4j.appender.file.File=application.log
		 * 
		 * # Defining maximum size of a log file log4j.appender.file.MaxFileSize=10mb
		 * log4j.appender.file.MaxBackupIndex=10
		 * log4j.appender.file.layout=org.apache.log4j.PatternLayout
		 * log4j.appender.file.layout.ConversionPattern=%d{ISO8601} %5p [%t] %c{1}:%L -
		 * %m%n log4j.appender.file.Append=false
		 */
	}
}
