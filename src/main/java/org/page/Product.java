package org.page;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Product extends BaseClass {
	
	public Product() {
	PageFactory.initElements(driver, this);
	}
	

	@FindBy(name="ctl00$txtsearch")
	private WebElement search;
	
	@FindBy(id="ctl00_btnsearch")
	private WebElement searchbtn;
	
	@FindBy(xpath="(//img[@height='206px'])[3]")
	private WebElement third;
	
	@FindBy(xpath="//input[@value='ADD TO CART']")
	private WebElement addtocard;

	@FindBy(xpath="(//a[@class='cartico'])[1]")
	private WebElement atcsymbol;
	
	@FindBy(xpath="//input[@class='checkbtn']")
	private WebElement checkout;
	
	@FindBy(xpath="(//div)[47]")
	private WebElement bill;

	// smartphone details
	
	@FindBy(id="catobtn")
	private WebElement threeline;
	
	@FindBy(xpath="(//a[text()='Samsung'])[2]")
	private WebElement samsung;
	
	@FindBy(xpath="//div[@class='productDetailsBx']")
	private WebElement listofsamsung;
	
	@FindBy(xpath="(//div[@class='wid'])[20]")
	private WebElement aboutADD;
	
	@FindBy(xpath="//li[@class='smartwatch']")
	private WebElement smartwatch;
	
	@FindBy(xpath="(//a[@title='iBrit'])[1]")
	private WebElement brit; 
	
	@FindBy(xpath="//span[@class='proPricebx']")
	private  WebElement price;
	
	@FindBy(xpath="(//a[@target='_blank'])[5]")
	private WebElement insta;
	
	@FindBy(id="ctl00_drpbrand")
	private WebElement drop;
	
	//realme models with price
	
	@FindBy(xpath="//a[contains(text(),'Power')]")
	private WebElement powerbank;
	
	@FindBy(xpath="(//a[@title='Realme'])[1]")
	private WebElement realme;
	
	@FindBy(xpath="//div[@class='productDetailsBx']")
	private WebElement realmemodel;
	
	@FindBy(xpath="//span[@class='proPricebx']")
	private WebElement pricemodel;
	
	
	
	
	
	
	
	
	
	
	public WebElement getPowerbank() {
		return powerbank;
	}

	public WebElement getRealme() {
		return realme;
	}

	public WebElement getRealmemodel() {
		return realmemodel;
	}

	public WebElement getPricemodel() {
		return pricemodel;
	}

	public WebElement getDrop() {
		return drop;
	}

	public WebElement getInsta() {
		return insta;
	}

	public WebElement getSmartwatch() {
		return smartwatch;
	}

	public WebElement getBrit() {
		return brit;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getAboutADD() {
		return aboutADD;
	}

	public WebElement getThreeline() {
		return threeline;
	}

	public WebElement getSamsung() {
		return samsung;
	}

	public WebElement getListofsamsung() {
		return listofsamsung;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getThird() {
		return third;
	}

	public WebElement getAddtocard() {
		return addtocard;
	}

	public WebElement getAtcsymbol() {
		return atcsymbol;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getBill() {
		return bill;
	}
	
	
	
	public static void togetOptions() {
        Product p=new Product();
        WebElement drop2 = p.getDrop();
        selectbyvisibletext(drop2, "Samsung");
	}
	
	public static void tomap() {
       List<WebElement> model = driver.findElements(By.xpath("//div[@class='productDetailsBx']"));
       List<WebElement> price = driver.findElements(By.xpath("//span[@class='proPricebx']"));
       Map<String,String> mp=new LinkedHashMap<String, String>();
       for (int i = 0; i < model.size(); i++) {
		System.out.println(model.get(i).getText()+"======="+price.get(i).getText());
		mp.put(price.get(i).getText(), model.get(i).getText());
		
	}
       System.out.println("........mp values.......");
       System.out.println(mp);
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
