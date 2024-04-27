package Resources;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

	public WebDriver driver;
	public Properties pro;

	public void initializeDriver() throws IOException {

		// To read the data
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");

		Properties prop = new Properties();
		prop.load(fs);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		}

		else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		}

		else {

			System.out.println("please choose proper browser");
		}

	}

}
