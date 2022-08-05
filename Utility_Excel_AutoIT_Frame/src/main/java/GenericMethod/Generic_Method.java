package GenericMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Generic_Method
{

	public static void radioGenderButton(WebDriver driver, String gender) {
		if(gender == "male") {
			driver.findElement(By.xpath("//input[@id=\"Male\"]")).click();
		}else {
			driver.findElement(By.xpath("//input[@id=\"Female\"]")).click();
		}
	}
}
	