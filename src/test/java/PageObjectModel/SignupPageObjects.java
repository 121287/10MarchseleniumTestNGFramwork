package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {

	private WebDriver driver;

	private By firstname = By.xpath("(//input[@name='UserFirstName'])");
	private By lastname = By.xpath("(//input[@name='UserLastName'])");
	private By JobTitle = By.xpath("(//input[@name='UserTitle'])");
	private By NextButton = By.xpath("(//span[container ( text(),'Next')]");
	private By selectEmployee = By.xpath("//select[@name='CompanyEmployees']");
	private By Company = By.xpath("//input[@name='CompanyName']");
	private By selectCountry = By.xpath("//select[@name='CompanyEmployees']");
	private By Nexttab = By.xpath("(//span[container ( text(),'Next')]");
	private By userphone = By.xpath("(//input[@name='UserPhone'])");
	private By Useremail = By.xpath("(//input[@name='UserEmail'])");

	public SignupPageObjects(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement enterFirstName() {

		return driver.findElement(firstname);

	}

	public WebElement enterLastName() {

		return driver.findElement(lastname);

	}

	public WebElement enterJobTitle() {

		return driver.findElement(JobTitle);

	}

	public WebElement clickOnNextButton() {

		return driver.findElement(NextButton);

	}

	public WebElement selectEmployees() {

		return driver.findElement(selectEmployee);

	}

	public WebElement company() {

		return driver.findElement(Company);
	}

	public WebElement selectCountry() {

		return driver.findElement(selectCountry);
	}

	public WebElement clickOnNexttab() {

		return driver.findElement(Nexttab);
	}

	public WebElement userphone() {

		return driver.findElement(userphone);

	}

	public WebElement useremail() {

		return driver.findElement(Useremail);

	}

}
