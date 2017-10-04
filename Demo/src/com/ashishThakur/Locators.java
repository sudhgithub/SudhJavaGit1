package com.ashishThakur;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {


		System.setProperty("webdriver chrome driver", "C:\\Users\\1345\\Desktop\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.eenadupellipandiri.net/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Sudh");
		driver.findElement(By.name("name")).clear();
		
		//driver.findElement(By.className("textlbl")).sendKeys("Sudhone");		
		//driver.findElement(By.xpath("")).sendKeys("Sudhone");
		
		//driver.findElement(By.linkText("")).click();
		//driver.findElement(By.partialLinkText("")).click();
		
		 List<WebElement> tat = driver.findElementsByTagName("a"); 
		 
		 for(int i = 0;i<tat.size();i++ )
		 {
			 if(!tat.get(i).getText().isEmpty())
			 {
				 String lnk = tat.get(i).getText();
				 System.out.println(lnk);
			 }
		 }
		
				
				
		
}
}
