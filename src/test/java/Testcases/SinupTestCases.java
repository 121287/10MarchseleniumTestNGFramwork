package Testcases;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import PageObjectModel.LoginPageObjects;
import Resources.Baseclass;
import Resources.constants;
import PageObjectModel.SignupPageObjects;

public class SinupTestCases extends Baseclass {

	@Test
	public void verifySignup() throws IOException, InterruptedException {

		initializeDriver();
		driver.get("https://login.salesforce.com/");

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.clickOnTryForFree().click();

		SignupPageObjects spo = new SignupPageObjects(driver);

		Thread.sleep(5000);
		spo.enterFirstName().sendKeys(constants.firstname);

		spo.enterLastName().sendKeys(constants.lastname);

		spo.enterJobTitle().sendKeys(constants.jobtitle);

		spo.clickOnNextButton().click();

		WebElement a = spo.selectEmployees();
		Select s = new Select(a);
		s.selectByIndex(2);
		s.selectByIndex(0);
		s.selectByIndex(1);

		spo.enterJobTitle().sendKeys();

		WebElement b = spo.selectCountry();
		Select s1 = new Select(b);
		s1.selectByIndex(1);

		spo.clickOnNexttab().click();

		spo.userphone().sendKeys("9762603575");

		spo.useremail().sendKeys("test@ibm.com");

	}

}
