package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo25 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/");
	WebElement email = driver.findElement(By.name("identifier"));
	email.sendKeys("snehaljagtap620@gmail.com");
	WebElement next = driver.findElement(By.id("identifierNext"));
	next.click();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.name("password"));
	ele.sendKeys("snehal29");
	WebElement next2 = driver.findElement(By.id("passwordNext"));
	next2.click();
}
}