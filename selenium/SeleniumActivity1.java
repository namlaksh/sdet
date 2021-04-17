package testngActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SeleniumActivity1 {
  @Test
 
	 public void  Activity1() 
	  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver_win32\\chromedriver.exe");  
      
      // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  
   
    // Launch Website 
    driver.navigate().to("https://alchemy.hguy.co/lms"); 
    driver.manage().window().maximize();  
    driver.get("https://alchemy.hguy.co/lms");
   
    String title= driver.getTitle();
    //storing title of the tab in the browser
    System.out.println(""+driver.getTitle());
    String titleM="Alchemy LMS – An LMS Application";
    if(title.equalsIgnoreCase(titleM)) //comparing title with given text
    {
    	System.out.println("title is matched");
    }
    
    else
    {
    	System.out.println("title is not matched");
    }
    driver.close();
	
  } }
 

