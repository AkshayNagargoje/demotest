package uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriverAutoIT.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://javabykiran.com/playground/file-upload");
		wd.findElement(By.id("file")).click();
		Thread.sleep(8000);
		Runtime.getRuntime().exec("E:/AutoIT/demo.exe");

	}
}
