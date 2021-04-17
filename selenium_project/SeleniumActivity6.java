package testngActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class SeleniumActivity6 {
	@Test

	  public  void Activity6() throws Throwable 
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
  Thread.sleep(1000);
 System.out.println("Account menu selected");
 Boolean Enable = driver.findElement(By.xpath("//div//h1[contains(text(),'My Account')]")).isEnabled();
 
 if(Enable)
 {
	 	System.out.println("your in My Account page");
	driver.findElement(By.xpath("//div//a[@href='#login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p//input[@type='text']")).sendKeys("root"); //username
	driver.findElement(By.xpath("//p//input[@type='password']")).sendKeys("pa$$w0rd"); //password
	driver.findElement(By.xpath("//p//input[@type='submit']")).click(); //login
	Thread.sleep(2000);
	
	if(driver.findElement(By.xpath("//div//a[@class='ld-profile-edit-link']")).isEnabled())//verifying login page
	{
		System.out.println("welcome to login page");
	}
	
	else
	 {
	 	System.out.println("login not successful");
	 }
	 }
 else
 {
 	System.out.println("your in not My Account page");
 }
 
 
 
 
 
  driver.close();
  driver.quit();
	
} }



