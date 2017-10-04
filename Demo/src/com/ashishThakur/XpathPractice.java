package com.ashishThakur;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		
		
		//getTest();		getAttribute();		getPagesource();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1345\\Desktop\\Selenium\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver ();
		
		driver.get("https://www.eenadupellipandiri.net/");
		//driver.navigate().to("https://www.amazon.co.in");
		
		
		
		driver.manage().window().maximize();
		

	}

}
