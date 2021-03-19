package test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		String MainWindow = driver.getWindowHandle();
		
		driver.findElement(By.id("privacy-link")).click();
		
		Set<String> Child = driver.getWindowHandles();
		
		for(int i=0; i<Child.size(); i++) {
			if (Child.equals(MainWindow)) {
				driver.switchTo().window(MainWindow);
				}
		}
		
		driver.findElement(By.id("cookie-use-link")).click();
		

		Set<String> Child1 = driver.getWindowHandles();
		
		for(int i=0; i<Child1.size(); i++) {
			if (!(Child1.equals(MainWindow))) {
				driver.close();
				
				}
			else
				driver.switchTo().window(MainWindow);
		}
		
		

	}

}
