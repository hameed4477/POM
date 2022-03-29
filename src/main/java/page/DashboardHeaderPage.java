package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardHeaderPage {
	WebDriver driver;
	
	public DashboardHeaderPage(WebDriver driver) {
		this.driver = driver;
	}
//	MUST use FindBy instead of WebElement and By class// they dont work with POM.
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2" ) WebElement DASHBOARD_HEADER_ELEMENT;
	
	public void verifyDashboardHeader() {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "Dashboard", "Wrong Page dude!!");
	}
}
