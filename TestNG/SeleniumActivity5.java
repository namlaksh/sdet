package testngActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class SeleniumActivity5 {
	@Test

	  public  void Activity5() throws Throwable 
	  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver_win32\\chromedriver.exe");  
    
    // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
 
  // Launch Website 
  driver.navigate().to("https://alchemy.hguy.co/lms"); 
  driver.manage().window().maximize();  
  driver.get("https://alchemy.hguy.co/lms");
 String Xpath="//a[contains(text(),'My Account')]";
  driver.findElement(By.xpath(Xpath)).click();
  Thread.sleep(2000);
 System.out.println("Account menu selected");
 Boolean Enable = driver.findElement(By.xpath("//div//h1[contains(text(),'My Account')]")).isEnabled();
 
 if(Enable)
 {
	 	System.out.println("your in My Account page");
 }
 else
 {
 	System.out.println("your in not My Account page");
 }
  driver.close();
  driver.quit();
	
} }



