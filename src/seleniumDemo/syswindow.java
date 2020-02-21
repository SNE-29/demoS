package seleniumDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class syswindow {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.id("file_wraper0")).click();
		
		Runtime.getRuntime().exec("‪D:/snehal/ste1.exe");
		

	}

}
