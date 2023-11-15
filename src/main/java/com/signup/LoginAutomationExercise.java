package com.signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomationExercise {
	
	public void getExercise() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://automationexercise.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@href='/login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='email'])[1]")).sendKeys("tabassumbhadria@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Riatabassum4314");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
		}
	public static void main(String[] args) throws InterruptedException {
		LoginAutomationExercise obj=new LoginAutomationExercise();
		obj.getExercise();
		
	}

}
