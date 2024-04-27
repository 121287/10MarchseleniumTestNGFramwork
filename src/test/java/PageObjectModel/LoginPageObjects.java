package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver; // This driver don't have scope

	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@name='Login']");
	private By TryForFree = By.xpath("//a[@id='signup_link']");

	public LoginPageObjects(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement enterUsername() {

		return driver.findElement(username);
	}

	public WebElement enterPassword() {

		return driver.findElement(password);
	}

	public WebElement clickOnLogin() {

		return driver.findElement(login);

	}

	public WebElement clickOnTryForFree() {

		return driver.findElement(TryForFree);
	}
}
