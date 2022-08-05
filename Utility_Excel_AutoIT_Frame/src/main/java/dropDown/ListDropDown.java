
	package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListDropDown {
////input[@data-val="2"], //input[@id="testSelect1_inpu"] ,//input[@id="testSelect1_input"]
	
	@Test
	public void list() {
		
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    WebDriver wd= new ChromeDriver();
    wd.get("https://www.cssscript.com/demo/multiselect-dropdown-list-checkboxes-multiselect-js/");
 
    WebElement ele =wd.findElement(By.xpath("//input[@id=\"testSelect1_input\"]"));
    Select sel = new Select(ele);
  List<WebElement> idea  =sel.getOptions();
  int a =idea.size();
  System.out.println(a);
  for(WebElement list : idea) {
	  System.out.println("get text"+list.getText());
	  System.out.println();
  }
	}
}
