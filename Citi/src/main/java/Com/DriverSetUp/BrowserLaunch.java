package Com.DriverSetUp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrowserLaunch 
{
                 WebDriver driver; 
             	public String driverPath = "D:\\HomeDirectory\\Citi\\chromedriver.exe";
          @BeforeClass
             	public void ChromeDriver()
                 {
                	 System.setProperty("webdriver.chrome.driver", driverPath);
                     driver=new org.openqa.selenium.chrome.ChromeDriver();	 
                     driver.manage().window().maximize();
                     
                 }
          @Test(priority=1)
          public void Url_Launch()
          {
        	  driver.get("https://www.facebook.com/");
        	  driver.close();
          }
        
                
}
