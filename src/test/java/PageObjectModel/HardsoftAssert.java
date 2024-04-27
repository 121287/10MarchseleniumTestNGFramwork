package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class HardsoftAssert {
	@Test
	public void loginfail() {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://login.salesforce.com/");
	
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
	
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	
	String actualtext = ("Error msg not showing");
	String expectedtext =("Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
	
	Assert.assertEquals(actualtext, expectedtext, "Error msg not showing");
	
	System.out.println("Test case passed");
	
	
	
	
	
	}
	
	

}
