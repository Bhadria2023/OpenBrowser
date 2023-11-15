package com.generic;

import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAutomationExercise {
	
	public void getLogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to(BaseConfig.getConfigValue("QA_URL"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		MasterpageFactory2 mpf=new MasterpageFactory2(driver);
		
		Highlighter.addColor(driver,mpf.getLoginBtnHome1() );
		mpf.getLoginBtnHome1().click();
		Screenshot.getScreenShot(driver, "Bhadria");
		
		if(mpf.getLoginBtnHome2().isDisplayed()) {
			System.out.println("Log in successful");
		}else {
			System.out.println("Log in failed");
		}
		
	}

}
