package newstudent;

import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;

public class FinishTest {
	@AfterTest
	public void afterTest(WebDriver driver) {
		driver.quit();
		System.out.println("After Test Run Here");

	}
}
