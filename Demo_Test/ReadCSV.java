package Demo_Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util. List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSV {

	public static void main(String[] args) throws IOException, Exception {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\ChromeDriver\\chromedriver.exe");			
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\SrikrushnaKumarSethi\\eclipse-workspace\\MavebWebDriver\\TestResourses\\Login.csv"));
		 
		 // this will load content into list
		  List<String[]> li=reader.readAll();
		  System.out.println("Total rows that we have is "+li.size());
		            
		 // create Iterator reference
		  Iterator<String[]>i1= li.iterator();
		    
		 // Iterate all values 
		 while(i1.hasNext()){
			 String[] str=i1.next();
		 
			 driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
			 driver.findElement(By.name("email")).sendKeys(str[0]);
			 driver.findElement(By.name("password")).sendKeys(str[1]);
			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 Thread.sleep(3000);
			 System.out.println(driver.getTitle());
			 driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			 Thread.sleep(3000);
		 }	   
		 driver.close();

	}

}
