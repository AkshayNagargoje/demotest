package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver localDriver;
	
	public LoginPage(WebDriver RemoteDriver) {
		PageFactory.initElements(RemoteDriver, this);
	}                           // chromedrve = local 
	
	@FindBy(id="email") 
	WebElement Email;
	
   @FindBy(id="password")
   WebElement password;
   
  @FindBy(xpath="//*[@id=\"form\"]/div[3]/div/button")
  WebElement button;
  
  @FindBy(linkText = "Users")
  WebElement user;
  
  public void SetEmail(String uname) {
	  Email.sendKeys(uname);
  }
  public void SetPassord(String Pass) {
	  password.sendKeys(Pass);
  }	
  public void clickLoginButton() {
	  button.click();
  }
  public void clickUser() {
	  user.click();
  }

}
