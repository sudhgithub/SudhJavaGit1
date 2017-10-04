package com.icicibank;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NewDriver {

	public static void main(String[] args) throws InterruptedException {
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\1345\\Downloads\\Selenium\\geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.amazon.co.in");
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\1345\\Downloads\\Selenium\\IEDriverServer.exe");
		InternetExplorerDriver driver2 = new InternetExplorerDriver();
		driver2.get("https://www.amazon.co.in");*/
		
		String str = System.getProperty("user.dir");
		System.out.println(str);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1345\\Downloads\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
	}

}
