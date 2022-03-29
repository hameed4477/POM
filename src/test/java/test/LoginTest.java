package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardHeaderPage;
import page.LoginPage;
import util.BrowserFactory;
@Test
public class LoginTest {
	WebDriver driver;
	public void validUserShouldBeAbleLogin() {
		
		driver =BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSignInButton();
		DashboardHeaderPage dashboard =  PageFactory.initElements(driver, DashboardHeaderPage.class);
		dashboard.verifyDashboardHeader();
		BrowserFactory.tearDown();
	}
}
