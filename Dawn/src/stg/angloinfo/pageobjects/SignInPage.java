package stg.angloinfo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {
	
	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	private WebElement formEmail;
	private WebElement formPassword;
	@FindBy(xpath="//form[@id='form-signin']/button")
	private WebElement loginButton;
	
	public MemberDashBoardPage SignInWithEmail(String email,String password) {
		
		formEmail.sendKeys(email);
		formPassword.sendKeys(password);
		loginButton.click();
		
		return new MemberDashBoardPage(driver);
		
	}
	
}
