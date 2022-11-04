package Image;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessFF {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver (options);
		
		driver.get("https:/www.google.co.in");
		
		System.out.println("Executing firefox Driver in Headless mode.. \n");
		
		System.out.println(">> page title :" + driver.getTitle());
		
		System.out.println(">>>>page url :"+ driver.getCurrentUrl());
		
		

	}

}
