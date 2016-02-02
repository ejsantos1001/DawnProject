package stg.angloinfo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MemberDashBoardPage {

	WebDriver driver;
	
	public MemberDashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	
	}

		
}
