package Testcases;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Resources.Baseclass;
import Resources.constants;
public class LoginTestCase extends Baseclass {

	@Test(dataProvider = "testdata")
	public void verifyLogin(String username, String password) throws IOException {

		initializeDriver();
		driver.get(pro.getProperty("url"));

		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.enterUsername().sendKeys(username);
		lpo.enterPassword().sendKeys(password);
		lpo.clickOnLogin().click();

		// object is class
		// object[][] -- is a return type of dataprovider

	}

	@Test
	@DataProvider
	 public Object[][]testdata(){              // testdata --is dataprovider name
		 
		Object [][] data = new Object[3][2];  //create the object of class
		 data[0][0]=constants.username1;
		 data[0][1]=constants.password1;
		 data[1][0]=constants.username2;
		 data[1][1]=constants.password2;
		 data[2][0]=constants.username3;
		 data[2][2]=constants.password3;
		 
		return data;
		 
		 
		 
		 
	 }

}