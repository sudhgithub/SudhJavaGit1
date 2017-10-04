package com.ashishThakur;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1345\\Desktop\\Selenium\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver ();
		
		driver.get("https://www.eenadupellipandiri.net/");
		//driver.navigate().to("https://www.amazon.co.in");
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String dr = driver.getTitle();
		System.out.println(dr);
		
		String current = driver.getCurrentUrl();
		System.out.println(current);
		
		 String page = driver.getPageSource();
		 System.out.println(page);
		
	//	driver.close();
		
		
		
		

	}

}
