package Image;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless_Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\driver\\GeckoDriver\\geckodriver.exe");
		
		WebDriver driver= new HtmlUnitDriver();
		
		driver.get("http://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys("Ghost Browser");
		
		element.submit();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		System.out.println("page title is :" + driver.getTitle());
		
		
		driver.quit();
	}

}
