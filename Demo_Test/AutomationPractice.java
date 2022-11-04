package Demo_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationPractice {


    @Test
    public void APLogin()  {
    
    System.setProperty("webdriver.chrome.driver","D:\\driver\\ChromeDriver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    
    driver.navigate().to("http://automationpractice.com/index.php");
    
    String Title=driver.getTitle();
    System.out.println("The Title of the page is - " +Title);
    
    driver.findElement(By.linkText("Sign in")).click();
    
    driver.findElement(By.id("email")).sendKeys("Csr@gmail.com");
    
    driver.findElement(By.id("passwd")).sendKeys("complex");
    
    driver.findElement(By.id("SubmitLogin")).click();
    
    System.out.println("Login Succesful");
            
    if(driver.findElement(By.linkText("csr complex")).isDisplayed()) {
        System.out.println("Login is Succesfull"+ driver.findElement(By.linkText("csr complex")).getText());
    }
        else {
            driver.navigate().back();
            
        }


driver.close();
		

	}

}
