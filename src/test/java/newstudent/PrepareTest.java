package newstudent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PrepareTest {
	String driverPath = System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe";
	public WebDriver driver;
@BeforeTest
	public WebDriver beforeTest() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}