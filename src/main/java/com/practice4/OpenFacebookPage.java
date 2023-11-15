package com.practice4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenFacebookPage {
	
	public void getFacebook() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("riatabassum4314@gmail.com");
		
	}
	public static void main(String[] args) throws InterruptedException {
		OpenFacebookPage obj= new OpenFacebookPage();
		obj.getFacebook();
		
	}

}
