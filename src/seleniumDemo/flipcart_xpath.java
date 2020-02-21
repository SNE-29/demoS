package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		/*WebElement close = driver.findElement(By.xpath("//button[@ class ='_2AkmmA _29YdH8']"));
		close.click();
		Thread.sleep(10000);*/
		WebElement search = driver.findElement(By.xpath("//input[@ type= 'text']"));
		search.sendKeys("shoes", Keys.ENTER);

		
				
		

	}

}
