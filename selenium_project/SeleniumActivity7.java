package testngActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class SeleniumActivity7 {
	@Test

	  public  void Activity7() throws Throwable 
	  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver_win32\\chromedriver.exe");  
    
    // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
 
  // Launch Website 
  driver.navigate().to("https://alchemy.hguy.co/lms"); 
  driver.manage().window().maximize();  
  driver.get("https://alchemy.hguy.co/lms");
 String Xpath="//a[contains(text(),'All Courses')]";
  driver.findElement(By.xpath(Xpath)).click(); //Click oon all cources
  Thread.sleep(1000);
 System.out.println("All cources clicked");
if(driver.findElement(By.xpath("//div//h1[contains(text(),'All Courses')]")).isEnabled()) 
{
	int Allcources= driver.findElements(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4']")).size(); //getting the Size of the cources
	System.out.println(+Allcources);
}
 

 
  driver.close();
  driver.quit();
	
} }



