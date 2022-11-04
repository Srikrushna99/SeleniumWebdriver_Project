package Demo_Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import au.com.bytecode.opencsv.CSVReader;

public class AtomationPractice_csv {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\ChromeDriver\\chromedriver.exe");			
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\SrikrushnaKumarSethi\\eclipse-workspace\\MavebWebDriver\\TestResourses\\Product.csv"));
		 
		 // this will load content into list
		  List<String[]> li=reader.readAll();
		  System.out.println("Total rows that we have is "+li.size());
		            
		 // create Iterator reference
		  Iterator<String[]>i1= li.iterator();
		    
		 // Iterate all values 
		 while(i1.hasNext()){
			 String[] str=i1.next();
		 
			// driver.findElement(By.xpath("//a[@class='login']")).click();
			// driver.findElement(By.xpath("//input[@id='email']")).sendKeys(str[0]);
			// driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(str[1]);
			// driver.findElement(By.xpath("//body[@id='authentication']/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='center_column']/div[@class='row']/div[@class='col-xs-12 col-sm-6']/form[@id='login_form']/div[@class='form_content clearfix']/p[@class='submit']/button[@id='SubmitLogin']/span[1]")).click();
			//driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(str[1]);
			// driver.findElement(By.xpath("//form[@id='searchbox']//button[@type='submit']")).click();
			// driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(str[1]);
			
			 driver.findElement(By.xpath("//input[@class=\"search_query form-control ac_input\"]")).sendKeys(str[0]);
			 driver.findElement(By.xpath("//button[@class=\"btn btn-default button-search\"]")).click();
            System.out.println(driver.getTitle());
			 driver.navigate().back();
			 Thread.sleep(8000);
			 driver.findElement(By.xpath("//input[@class=\"search_query form-control ac_input\"]")).sendKeys(str[1]);
			 driver.findElement(By.xpath("//button[@class=\"btn btn-default button-search\"]")).click();

			 Thread.sleep(8000);

			 System.out.println(driver.getTitle());
			 Thread.sleep(8000);

			 driver.navigate().back();


			 Thread.sleep(3000);
		 }	   
		 driver.close();

	}

}
