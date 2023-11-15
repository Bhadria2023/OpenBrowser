package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[contains(text(),' Signup / Login')]")
	private WebElement LoginbtnHome1;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath = "(//*[@name='email'])[1]")
	private WebElement Email;
	
	@FindBy(xpath = "(//*[contains(text(),'Login')])[4]")
	private WebElement loginBtnHome2;
	
	@FindBy(xpath="//*[contains(text(), 'Logout')]")
	private WebElement logOutBtn;
	
	//Costco
	@FindBy(xpath = "(//*[contains(text(),'Services')])[2]")
	private WebElement services;
	
	//Drag and Drop
	@FindBy(xpath="(//*[contains(text(),'Oslo')])[2]")
	private WebElement dragOslo;
	
	@FindBy(xpath = "(//*[contains(text(),'Norway')])[1]")
	private WebElement dropNorway;

	public WebElement getDragOslo() {
		return dragOslo;
	}

	public WebElement getDropNorway() {
		return dropNorway;
	}

	public WebElement getServices() {
		return services;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public WebElement getLoginBtnHome2() {
		return loginBtnHome2;
	}

	public WebElement getLoginbtnHome1() {
		return LoginbtnHome1;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getEmail() {
		return Email;
	}
}
	