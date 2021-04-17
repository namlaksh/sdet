package testngActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class SeleniumActivity3 {
	@Test

	  public  void Activity3() 
	  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver_win32\\chromedriver.exe");  
    
    // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
 
  // Launch Website 
  driver.navigate().to("https://alchemy.hguy.co/lms"); 
  driver.manage().window().maximize();  
  driver.get("https://alchemy.hguy.co/lms");
 String Xpathcourseheading="(//div//h3)[1]";
 String headingApp=driver.findElement(By.xpath(Xpathcourseheading)).getText();
 System.out.println(""+headingApp);
  String headingexp="Actionable Training";
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



