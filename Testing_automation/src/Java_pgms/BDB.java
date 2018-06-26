package Java_pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BDB {
	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa.bdbizviz.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("userid")).sendKeys("GoogleSheetTest@bdbizviz.com");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
	
		 driver.findElement(By.xpath("//button[text()='Login'] ")).click();*/
           
		 //open the browser and enter the url
		    System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");     
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://qa.bdbizviz.com/index.html");
		    
		    //click on login
		    driver.findElement(By.id("userid")).sendKeys("archana.ms@bdbizviz.com");
		    driver.findElement(By.name("password")).sendKeys("8dhHac");
		       driver.findElement(By.xpath("//button[text()='Login'] ")).click();
		       Thread.sleep(3000);
	}
}
