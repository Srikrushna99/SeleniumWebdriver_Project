package Demo_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTests {
	@BeforeTest
    public void setup() {
           System.setProperty("webdriver.gecko.driver",driverPath);            
            WebDriver driver = new FirefoxDriver();
            driver.get("https://Automationpractice.com/index.php");
    }


static String driverPath = "D:\\driver\\GeckoDriver\\geckodriver.exe";
WebDriver driver ;


   @DataProvider(name="TestData")
    public Object[] getData()
    {
        
    Object [] data= new Object[3]; //  1 Dimensional Array rows and col
    
    data[0]="Tshirt";
    
    data[1]="Jacket";
    
    data[2]="Pants";
    
    return data;
    
    }
    
    @Test(dataProvider="TestData")
    public void LoginValidation (String Product)
    {
    
    System.setProperty("webdriver.gecko.driver",driverPath);            
    WebDriver driver = new FirefoxDriver();
    driver.get("https://Automationpractice.com/index.php");


   driver.findElement (By.xpath("//input[@id='search_query_top']")).sendKeys(Product);
    driver.findElement(By.xpath("//form[@id='searchbox']")).click();
    driver.close();
     
    }
	
		
	}

	


