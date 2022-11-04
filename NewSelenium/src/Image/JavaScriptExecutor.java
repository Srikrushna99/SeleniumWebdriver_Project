package Image;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\driver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
        driver.navigate().to("http://automationpractice.com/index.php");
        JavascriptExecutor js =  (JavascriptExecutor)driver;
        
     js.executeScript("document.getElementsByName('search_query')[0].value='dress'");
      js.executeScript("document.getElementsByName('submit_search')[0].click");
      
    
        
	}

}
