package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script 
{
	 WebDriver driver;
		
		@Given("Open chrome browser and url of the application")
		public void open_chrome_browser_and_url_of_the_application() 
		{
			  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			  driver.manage().window().maximize();
			
		    System.out.println("Given start");
		}

		@When("Enter valid email id and click create an account button")
		public void enter_valid_email_id_and_click_create_an_account_button() throws InterruptedException 
		{
			  driver.findElement(By.id("email_create")).sendKeys("Ynitin1999@gmail.com");
			  driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")).click();
			  Thread.sleep(3000);
			  
			  driver.findElement(By.xpath("(//input[@name=\"id_gender\"])[1]")).click();
			  driver.findElement(By.id("customer_firstname")).sendKeys("Nitin");
			  driver.findElement(By.id("customer_lastname")).sendKeys("Yadav");
			  driver.findElement(By.id("email")).clear();
			  driver.findElement(By.id("email")).sendKeys("Ynitin156@gmail.com");
			  driver.findElement(By.id("passwd")).sendKeys("Ynitin00@");
			  driver.findElement(By.id("days")).sendKeys("7");
			  driver.findElement(By.id("months")).sendKeys("March");
			  driver.findElement(By.id("years")).sendKeys("1996");
			  driver.findElement(By.id("optin")).click();
			  
			  driver.findElement(By.id("firstname")).sendKeys("Nitin");
			  driver.findElement(By.id("lastname")).sendKeys("Yadav");
			  driver.findElement(By.id("company")).sendKeys("HCL");
			  driver.findElement(By.id("address1")).sendKeys("old panchwati ghaziabad");
			  driver.findElement(By.id("address2")).sendKeys("panchwati");
			  driver.findElement(By.id("city")).sendKeys("GHAZIABAD");
			  driver.findElement(By.id("id_state")).sendKeys("Washington");
			  driver.findElement(By.id("postcode")).sendKeys("00000");
			  driver.findElement(By.id("id_country")).sendKeys("United States");
			  driver.findElement(By.id("other")).sendKeys("9910183070");
			  driver.findElement(By.id("phone")).sendKeys("9810262894");
			  driver.findElement(By.id("phone_mobile")).sendKeys("9910305181");
			  driver.findElement(By.id("alias")).sendKeys("84panchwati");
			  
			  driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")).click();
		
			
			System.out.println("When done");
		}

		@Then("Successfully new account is create")
		public void successfully_new_account_is_create() 
		{
		    
			System.out.println("Then done");
		}
        
		
		
		@When("Enter valid email id and valid pass click to login button")
		public void enter_valid_email_id_and_valid_pass_click_to_login_button() 
		{
			
			driver.findElement(By.id("email")).sendKeys("Ynitin156@gmail.com");
			  driver.findElement(By.id("passwd")).sendKeys("Ynitin00@");
			  driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();
			  
			  driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
			  driver.findElement(By.name("submit_search")).click();
			  
			  driver.findElement(By.linkText("Printed Chiffon Dress")).click();
			  
			  driver.findElement(By.id("quantity_wanted")).click();
			  driver.findElement(By.id("group_1")).click();
			  driver.findElement(By.id("color_15")).click();
			  driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
			  WebDriverWait wdw = new WebDriverWait(driver,20);
			  wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]"))).click();
			  
			  WebDriverWait wdw2 = new WebDriverWait(driver,20);
			  wdw2.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]"))).click();
			  
			  WebDriverWait wdw3 = new WebDriverWait(driver,20);
			  wdw3.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]"))).click();
			  
			  driver.findElement(By.id("cgv")).click();
			  
			  WebDriverWait wdw4 = new WebDriverWait(driver,20);
			  wdw4.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]"))).click();
			  
		
			
		    System.out.println("when is done");
		}

		@Then("click on the search option and product add succesfully in cart")
		public void click_on_the_search_option_and_product_add_succesfully_in_cart() 
		{
			 System.out.println("then is done");
		}



}
