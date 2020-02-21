package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authentication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String user = "admin";
		String pass = "admin";
		String url = "https://"+ user +":"+ pass +"@the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");//remove the authenticate window using admin:admin@
		

	}

}
