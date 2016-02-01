/**
 * 
 */
package PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * @author ejsantos
 *
 */
public class LandingPage {

	@FindBy(how = How.ID, using = "myangloDropdownToggle" )
	private WebElement signInButton;
	
	public void goToLoginPage () {
		signInButton.click();
		
	}
	
}
