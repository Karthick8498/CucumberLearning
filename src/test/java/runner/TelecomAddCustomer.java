package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TelecomAddCustomer {
	WebDriver driver; 
	@Given("^The user is in guru telecom page \"([^\"]*)\"$")
	public void the_user_is_in_guru_telecom_page(String url) throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthick\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}


	@When("^The user enter \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enter_and(String firstName, String lastName, String mailId, String address, String mobileNo) throws Throwable {
   
		driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(firstName);
	    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(lastName);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(mailId);
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(address);
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(mobileNo);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@Then("^The user should get their CustomerId$")
	public void the_user_should_get_their_CustomerId() throws Throwable {
	   
		String text = driver.findElement(By.xpath("//b[contains(text(),'Customer ID')]//following::h3")).getText();
		System.out.println("Customer Id: "+text);
	    boolean status = driver.findElement(By.xpath("//b[contains(text(),'Please Note Down Your CustomerID')]")).isDisplayed();
	    Assert.assertTrue(status);
	}
}
