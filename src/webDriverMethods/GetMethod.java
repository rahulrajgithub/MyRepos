package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Thread.sleep(1000);
		
		
		
		
		//driver.close();
		//driver.quit();
		
		driver.manage().window().maximize();   //step to maximize window
		Thread.sleep(1000);
		//driver.manage().window().minimize();
		
		driver.get("https://www.facebook.com/login/"); 
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh(); // used to refresh page
		driver.navigate().to("https://www.redbus.in/");

	}

}
