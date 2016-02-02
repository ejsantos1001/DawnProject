package stg.angloinfo.tests;

import org.testng.annotations.Test;

import stg.angloinfo.boilerplates.BaseTest;
import stg.angloinfo.pageobjects.IndexPage;
import stg.angloinfo.pageobjects.MemberDashBoardPage;
import stg.angloinfo.pageobjects.SignInPage;
import org.testng.annotations.DataProvider;



public class TestObjectA extends BaseTest {

  @Test(dataProvider ="dp")
  public void TestAction(String email, String password) {
	  IndexPage IndexPageInstance = new IndexPage(driver);
	  SignInPage SignInPageInstance = IndexPageInstance.goToSignInPage();
	  MemberDashBoardPage MemberDashBoardInstance = SignInPageInstance.SignInWithEmail(email, password);
	  
  }
;
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "eliazertest+5@gmail.com", "Ai1234567" },
      //new Object[] { 2, "b" },
    };
  }
}
