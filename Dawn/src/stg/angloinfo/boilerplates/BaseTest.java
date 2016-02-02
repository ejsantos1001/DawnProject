package stg.angloinfo.boilerplates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

 
// Contains test setups extend to inherit test setup
// reference http://www.seleniumeasy.com/selenium-tutorials/simple-page-object-model-framework-example
public class BaseTest {

	protected WebDriver driver;

	
	
    //Take parameters from testng xml file
	@Parameters({"browserType","appBaseURI"})
	@BeforeClass
	public void initializeBestTest (String browserType,String appBaseURI) {
		
		selectDriver(browserType,appBaseURI);
		
	}
	
	public  void selectDriver(String browserType,String appBaseURI) {
		
		switch(browserType.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			
			break;
		case "firefox":
			driver = new FirefoxDriver();
			
			break;
		default:
			driver= new FirefoxDriver();	
		
		}
		
		driver.get(appBaseURI);
		driver.manage().window().maximize();
		
	
	}
		
}
