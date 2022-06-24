package parabank.com.web_automation_2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AutomationCode2 extends Driversetup2 {
	
	
public static String baseUrl= "https://parabank.parasoft.com/parabank/index.htm";

	
	@Test
	public static void Parabank() throws InterruptedException { 

		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(3000); 
		
		         //Regestration
		
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("kamrul");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("islam");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("13/1 khilgaon");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Dhaka");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Bangladesh");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("1219");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("01676572264");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("+88");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("kamrul");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("01676572264");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("01676572264");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		
		          //login
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kamrul");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("01676572264");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		Thread.sleep(5000);
		
}
}
