package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationLogin {
	
	public void getLogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to(BaseConfig.getConfigValue("QA_URL"));
		driver.manage().window().maximize();
		MasterPageFactory mpf= new MasterPageFactory(driver);
		//highlight LoginbtnHome1
		Highlighter.addColor(driver,mpf.getLoginbtnHome1());
		mpf.getLoginbtnHome1().click();
		Thread.sleep(1500);
		mpf.getEmail().sendKeys(BaseConfig.getConfigValue("Email"));
		Highlighter.addColor(driver,mpf.getEmail() );
		mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));
		Thread.sleep(2000);
		Screenshot.getScreenShot(driver, "Bhadria");
		mpf.getLoginBtnHome2().click();
		if(mpf.getLogOutBtn().isDisplayed()) {
			System.out.println("Login successful");
			
		}else {
			System.out.println("Login failed!"); 
		
			
		}
		

	}
}