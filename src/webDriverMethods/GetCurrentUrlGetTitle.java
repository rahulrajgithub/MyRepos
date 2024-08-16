package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlGetTitle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.linkedin.com/");
		Thread.sleep(1000);
		String myTitle = driver.getTitle();
		System.out.println(myTitle);
		System.out.println("--------------------------------------");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

}
