package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	// this is the constructor with parameter (driver) 
	// when you don't create a constructor JAVA will give you one
	// so create a constructor with driver parameter and use (this) keyword to call the global driver and = to driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
//	MUST use FindBy instead of WebElement and By class// they dont work with POM.
	@FindBy(how = How.XPATH, using = "//input[@id=\"username\"]" ) WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"password\"]" ) WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button" ) WebElement SIGNIN_BUTTON_ELEMENT;
	
	public void insertUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);
	}
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	public void clickSignInButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
}
