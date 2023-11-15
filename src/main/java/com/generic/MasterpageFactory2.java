package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterpageFactory2 {
	
	public MasterpageFactory2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[contains(text(),' Signup / Login')]")
	private WebElement loginBtnHome1;

	

	@FindBy(xpath = "(//*[contains(text(),'Login')])[4]")
	private WebElement loginBtnHome2;



	public WebElement getLoginBtnHome1() {
		return loginBtnHome1;
	}



	public WebElement getLoginBtnHome2() {
		return loginBtnHome2;
	}

	
}
