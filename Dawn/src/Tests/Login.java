package Tests;

import org.testng.annotations.Test;
import PageObject.LandingPage;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Login {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  
  
  @Test
  public void firstTestCase() {
	  System.out.println("This is a sample test");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://stg.angloinfo.com/");
	  LandingPage Page = PageFactory.initElements(driver, LandingPage.class);
	  Page.goToLoginPage();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
