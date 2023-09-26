package org.stepdefinition.belltelme;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.page.LoginPage;
import org.page.Product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionBelltelme extends BaseClass {
	public static  Product p;
	public static WebDriver driver;
	@Given("The user should be in belltelme application")
	public void the_user_should_be_in_belltelme_application() {
	   
	}

	@When("The user has enter the username and password then click loginbtn")
	public void the_user_has_enter_the_username_and_password_then_click_loginbtn() {
		LoginPage l=new LoginPage();
		l.login();	
	}

	@When("the user has pass the search of wanted item")
	public void the_user_has_pass_the_search_of_wanted_item() {
	    p=new Product();
	    sendkeys(p.getSearch(), "samsung");
		   click(p.getSearchbtn());
		   click(p.getThird());
		   click(p.getAddtocard());
		   click(p.getAtcsymbol());
		   scrolldown(p.getCheckout());
		   click(p.getCheckout());
		   scrolldown(p.getBill());
	       
	}

	@Then("the user get product bill")
	public void the_user_get_product_bill() throws IOException {
		System.out.println(p.getBill().getText());
		screenshot("samsung");
	}
	
	
	//tc2
	
	@When("the user click the smart phone icon")
	public void the_user_click_the_smart_phone_icon() {
		 p=new Product();
		click(p.getThreeline());	
	}

	@When("the user click iphone subtitle")
	public void the_user_click_iphone_subtitle() {
		click(p.getSamsung());
	}
	

	@When("the user get all iphone details")
	public void the_user_get_all_iphone_details() throws IOException {
		driver=new ChromeDriver();
			gettext(p.getListofsamsung());
			screenshot("samsunglist");
		
	}
  //tc3
	@When("to scroll down last down")
	public void to_scroll_down_last_down() {
		 p=new Product();
	  scrolldown(p.getAboutADD());
	}

	@Then("To take screenshot on that place")
	public void to_take_screenshot_on_that_place() throws IOException {
       screenshot("address");

	}
	//tc4
	@When("To click smartwatch option")
	public void to_click_smartwatch_option() {
		 p=new Product();
		 click(p.getSmartwatch());
	}

	@When("To click iBrit option")
	public void to_click_iBrit_option() {
	    click(p.getBrit());
	}

	@When("to get all amount of watches list")
	public void to_get_all_amount_of_watches_list() {
	    List<WebElement> lt=new LinkedList<WebElement>();
	    
	    String text = p.getPrice().getText();
	    System.out.println(text);
	    int n=0;
	    if(text.contains("OMR 11.500")) {
	    	n=n+1;
	    }
	    System.out.println(n);
	}

// test case 5 to click insta icon and take screenshot
	
	@When("to scroll down till bottom of page")
	public void to_scroll_down_till_bottom_of_page() {
      p=new Product();
	scrolldown(p.getInsta());
	
	}

	@Then("the user has click to instra icon")
	public void the_user_has_click_to_instra_icon() {

	click(p.getInsta());
	}

	@Then("screen shot on that page")
	public void screen_shot_on_that_page() throws InterruptedException, IOException {
      Thread.sleep(8000);
      toWindowHandle();
     screenshot("instagram");
	}
	
//test6 to get all datas on search box and select
	@When("to click search near button of dropdown")
	public void to_click_search_near_button_of_dropdown() {
        p=new Product();
        click(p.getDrop());
	}

	@Then("to collect all datas and select if present samsung")
	public void to_collect_all_datas_and_select_if_present_samsung() {
       p.togetOptions();
      
	}
//test7 to get all realme models with price
	@When("to click on powerbank section")
	public void to_click_on_powerbank_section() {
	  p=new Product();
	  click(p.getPowerbank());
	  
	}

	@Then("to click on realme option")
	public void to_click_on_realme_option() {
	click(p.getRealme());
	}

	@Then("get all mobile models with price")
	public void get_all_mobile_models_with_price() {
       p.tomap();
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
