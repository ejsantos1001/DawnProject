package stg.angloinfo.tests;

import org.testng.annotations.Test;

import stg.angloinfo.boilerplates.BaseTest;
import stg.angloinfo.pageobjects.LandingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;


public class LoginTest extends BaseTest {

  @Test
  public void firstTestCase() {
	  LandingPage Page = PageFactory.initElements(driver, LandingPage.class);
	  Page.goToLoginPage();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
