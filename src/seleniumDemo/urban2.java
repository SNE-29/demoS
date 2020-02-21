package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urban2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		WebElement close = driver.findElement(By.xpath("//body[@ class ='one-col ul_desktop body_home modal-open']"));
		close.click();
		WebElement sale =driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		System.out.println(sale.getText());
		WebElement decor =driver.findElement(By.xpath("//li[ @class='topnav_item decorunit']"));
		System.out.println(decor.getText());
		
		
		
		

	}

}
