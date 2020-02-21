package seleniumDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robo2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement user = driver.findElement(By.name("q"));
		user.sendKeys("java",Keys.ENTER);
		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='kno-ecr-pt PZPZlf gsmt i8lZMc']"));
		Actions a = new Actions(driver);
		Thread.sleep(10000);
		for (WebElement menuname : menus) {
			String s = menuname.getText();
			System.out.println(s);

			a.moveToElement(menuname).perform();
			Thread.sleep(10000);
			List<WebElement> submenus = driver.findElements(
					By.xpath("//ul[@class='erkvQe']/li"));
			for (WebElement sub : submenus) {
				System.out.println(sub.getText());
				
		
		/*Actions a = new Actions(driver);
		WebElement java = driver.findElement(By.xpath("//div[@class='kno-ecr-pt PZPZlf gsmt i8lZMc']"));
		a.doubleClick();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T*/
		
	}
	
		
		
	

	}
	}
}

	


