package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericMethod.Generic_Method;

public class DropDownEx1 extends Generic_Method {
@Test
public void dropDrown() {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    WebDriver wd= new ChromeDriver();
    wd.get("file:///F:/JBK/software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
   // System.out.println("sr"+sr+" ");
    wd.findElement(By.id("email")).sendKeys("kiran@gmail.com");
 //  System.out.print("uName"+uName +" ");
   wd.findElement(By.id("password")).sendKeys("123456");
 //  System.out.print("password"+password);
   wd.findElement(By.xpath("//button")).click();
  wd.findElement(By.xpath("//i[@class='fa fa-user']")).click();
  wd.findElement(By.xpath("//*[@class=\"btn btn-block btn-primary btn-sm pull-right\"]")).click();
  System.out.println("1");
 Generic_Method.radioGenderButton(wd, "male");
 System.out.println("2");
 //dropdown 
 WebElement element= wd.findElement(By.xpath("//select[@class=\"form-control\"]"));
   Select sel= new Select(element);
   sel.selectByVisibleText("HP");
   
}
}

