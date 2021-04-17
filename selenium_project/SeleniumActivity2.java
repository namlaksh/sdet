package testngActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class SeleniumActivity2 {
	@Test

	  public  void Activity2() 
	  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver_win32\\chromedriver.exe");  
    
    // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
 
  // Launch Website 
  driver.navigate().to("https://alchemy.hguy.co/lms"); 
  driver.manage().window().maximize();  
  driver.get("https://alchemy.hguy.co/lms");
 
 String headingApp=driver.findElement(By.xpath("//div//h1[contains(text(),'Learn from Industry Experts')]")).getText();
 //getting text 'Learn from Industry Experts' from the Application 
 System.out.println(""+headingApp);
  String headingexp="Learn from Industry Experts";
  if(headingApp.equalsIgnoreCase(headingexp)) //comparing heading with the given text
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



