package Demo_Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ReadXML {

	WebDriver driver;
	@Test
	@Parameters({"dress"})
	public void searchProduct(@Optional("yellow casual dress")String dress) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\ChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	
		 driver.findElement(By.xpath("//input[@class=\"search_query form-control ac_input\"]")).sendKeys(dress);
		 driver.findElement(By.xpath("//button[@class=\"btn btn-default button-search\"]")).click();

		
	System.out.println(driver.getTitle());
	
	driver.close();
	}
}

