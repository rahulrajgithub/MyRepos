package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rahul@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		
	}

}
