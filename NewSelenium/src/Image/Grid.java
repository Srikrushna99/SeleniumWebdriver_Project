package Image;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid {
	@Test
    public void ohrmLogin() throws InterruptedException, MalformedURLException {
    	DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        
        //FirefoxOptions options = new FirefoxOptions();
        //WebDriver driver = new FirefoxDriver(options);
 
        /* The execution happens on the Selenium Grid with the address mentioned earlier */
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.10:1876"), caps);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
      
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
 		System.out.println(driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText());
 		caps.setCapability("takesScreenshot", true);
 		
        try {
      //Convert web driver object to TakeScreenshot
      //Call getScreenshotAs method to create image file
   	 	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   	 	//FileUtils.copyFile(src, new File(".screenshots.jpeg"));
   	 	FileHandler.copy(src, new File("D:\\Picture\\screenshots.jpeg"));
        }
        
        catch(Exception e){
            //if it fails to take screenshot then this block will execute
            System.out.println("Failure to take screenshot "+e);
        }  
   		
 		
 		driver.quit();//Quits browser and releases the resource
      }
}
