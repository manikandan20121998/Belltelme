package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement login;
	@FindBy(id="ctl00_ContentPlaceHolder1_txtusername")
	private WebElement username;
	@FindBy(id="ctl00_ContentPlaceHolder1_txtpassword")
	private WebElement password;	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnlogin")
	private WebElement clicklogin;
	public WebElement getLogin() {
		return login;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getClicklogin() {
		return clicklogin;
	}
	
	
	public static void login() {
        LoginPage l=new LoginPage();
		click(l.getLogin());
		sendkeys(l.getUsername(), "manikandansathya007@gmail.com");
		sendkeys(l.getPassword(), "manikandanpm");
		click(l.getClicklogin());
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
