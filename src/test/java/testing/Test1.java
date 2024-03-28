package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test(priority=-900000000)
	public void c() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.garment-labels.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.quit();

		System.out.println("Rahul ");

	}
	@Test(priority=900000000)
	public void b() {

		System.out.println("Hello ");
	}
	
	@Test()
	public void a() {

		System.out.println("Dev ");

	}
}
