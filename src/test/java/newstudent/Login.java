package newstudent;

//import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Login {
	@Test
	public void test( WebDriver driver) {
		String baseUrl = "http://novustrade.co/admin/login";
		driver.get(baseUrl);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String title = driver.getTitle();
		System.out.print(title);

	}


}


