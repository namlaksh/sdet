package testngActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class SeleniumActivity8 {
	@Test

	  public  void Activity8() throws Throwable 
	  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver_win32\\chromedriver.exe");  
    
    // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
 
  // Launch Website 
  driver.navigate().to("https://alchemy.hguy.co/lms"); 
  driver.manage().window().maximize();  
  driver.get("https://alchemy.hguy.co/lms");
 String Xpath="//a[contains(text(),'Contact')]";
  driver.findElement(By.xpath(Xpath)).click();
  Thread.sleep(1000);
 System.out.println("Contact clicked");
if(driver.findElement(By.xpath("//div//h1[contains(text(),'Need Help?')]")).isEnabled())
{
	   String Contactdetails[]= {"Likitha","likitha@gmail.com","need help","cources"};
	    driver.findElement(By.xpath("//div//input[@name='wpforms[fields][0]']")).sendKeys(Contactdetails[0]); //Name
	    driver.findElement(By.xpath("//div//input[@name='wpforms[fields][1]']")).sendKeys(Contactdetails[1]);// Email
	    driver.findElement(By.xpath("//div//input[@name='wpforms[fields][3]']")).sendKeys(Contactdetails[2]);//Subject
	    driver.findElement(By.xpath("//div//textarea[@name='wpforms[fields][2]']")).sendKeys(Contactdetails[3]);//comment
	    
	    driver.findElement(By.xpath("//div//button[@name='wpforms[submit]']")).click();//click on submit
	    Thread.sleep(2000);
	   if(driver.findElement(By.xpath("//div//p[contains(text(),'Thanks for contacting us')]")).isDisplayed())
		   
	   {
		   System.out.println("msg sent successfully");
	   }
	   else
	   {
		   System.out.println("msg not sent ");
	   }
	 
}
else
{
	   System.out.println("not navigated to contact page");
}
 

 
  driver.close();
  driver.quit();
	
} }



