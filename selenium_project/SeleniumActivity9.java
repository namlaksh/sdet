package testngActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class SeleniumActivity9 {
	@Test

	  public  void Activity9() throws Throwable 
	  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver_win32\\chromedriver.exe");  
    
    // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
 
  // Launch Website 
  driver.navigate().to("https://alchemy.hguy.co/lms"); 
  driver.manage().window().maximize();  
  driver.get("https://alchemy.hguy.co/lms");
 String Xpath="//a[contains(text(),'All Courses')]";
  driver.findElement(By.xpath(Xpath)).click();
  Thread.sleep(1000);
 System.out.println("All cources clicked");
if(driver.findElement(By.xpath("//div//h1[contains(text(),'All Courses')]")).isEnabled())
{
	
	driver.findElement(By.xpath("(//div//p//a[@class='btn btn-primary'])[1]")).click();
	//select social Media Marketing and click on see more
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("(//div//span[@class='ld-icon-arrow-down ld-icon ld-primary-background'])[1]")).click();
	 //select Developing Strategy
	 System.out.println(driver.findElement(By.xpath("(//div//a//div[@class='ld-item-title'])[1]")).getText());
	 Thread.sleep(2000);
	 
	 if(driver.findElement(By.xpath("(//div//a//div[@class='ld-status-icon ld-status-incomplete'])[1]")).isSelected())
	 {
	 driver.findElement(By.xpath("(//div//a//div[@class='ld-status-icon ld-status-incomplete'])[1]")).click();
	 }
	 else
	 {
		 System.out.println("Mark button is disable");
	 }
}
 
  driver.close();
  driver.quit();
	
} }



