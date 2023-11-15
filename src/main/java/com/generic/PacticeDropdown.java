package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PacticeDropdown {
	
	public void getDropDown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		
		Select sc= new Select(driver.findElement(By.xpath("//select")));
		//Select Cyprus by using VisibleText()
		sc.selectByVisibleText("Cyprus");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Select Algeria by using Index()
		sc.deselectByIndex(3);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Select Bangladesh by using selectByValue()
		sc.deselectByValue("BGD");
		
		
	}
	public static void main(String[] args) {
		PacticeDropdown obj= new PacticeDropdown();
		obj.getDropDown();
	}

}
