package testngActivities;

 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class SeleniumActivity4 {
	@Test

	  public  void Activity4() 
	  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver_win32\\chromedriver.exe");  
    
    // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
 
  // Launch Website 
  driver.navigate().to("https://alchemy.hguy.co/lms"); 
  driver.manage().window().maximize();  
  driver.get("https://alchemy.hguy.co/lms");
 String Xpathofthecorseheader="//div//h3[contains(text(),'Email Marketing Strategies')]";
 String headingApp=driver.findElement(By.xpath(Xpathofthecorseheader)).getText();
 System.out.println(""+headingApp);
  String headingexp="Email Marketing Strategies";
  if(headingApp.equalsIgnoreCase(headingexp))
  {
  	System.out.println("heading is matched");
  }
  
  else
  {
  	System.out.println("heading is not matched");
  }
  driver.close();
  driver.quit();
	
} }



