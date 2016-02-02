package stg.angloinfo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


// Page Object of Index Page 
// reference 
public class IndexPage {

	WebDriver driver;
	
	public IndexPage (WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//Page elements
	private WebElement myangloDropdownToggle;
	
	
	//Services In the Page
	
	public SignInPage goToSignInPage () {
		myangloDropdownToggle.click();
		return new SignInPage(driver);
		
	}
		
}
