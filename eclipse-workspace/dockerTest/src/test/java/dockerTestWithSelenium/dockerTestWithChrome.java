package dockerTestWithSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class dockerTestWithChrome {

	public static void main(String[] args) throws MalformedURLException {

//		ChromeOptions options=new ChromeOptions();
//		
//		options.setBinary("C:\\Users\\PROLAY SAHA\\chromeFor Selenium\\chrome-win64\\chrome-win64\\chrome.exe");
//		
//		WebDriver driver=new ChromeDriver(options);
//		
//		driver.get("https://www.amazon.in/");
//		driver.quit();
//		
		
		
		//DesiredCapabilities dc =new DesiredCapabilities();
		//dc.setBrowserName("chrome");
		
		
			//FirefoxOptions options=new FirefoxOptions();
		ChromeOptions options=new ChromeOptions();

		//ChromeDriver driver = new ChromeDriver();
		//URL url= new URL("http://localhost:4444");
		
		WebDriver rw= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
		
		
		
		rw.get("https://www.amazon.com/");
		System.out.print(rw.getTitle());
		
		
		
		rw.quit();
		System.out.print("test done");
	}

}
