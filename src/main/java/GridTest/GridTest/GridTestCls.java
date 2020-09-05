package GridTest.GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTestCls {

	public static void main(String[] args) throws MalformedURLException {
		
		//1)Dersired capabiities tanimlama
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		//2)Chrome Options
		ChromeOptions options= new ChromeOptions();
		options.merge(cap);
		
		//3) Hub adresini vermemiz lazim
		String hubUrl= "http://192.168.1.2:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		

	}

}
