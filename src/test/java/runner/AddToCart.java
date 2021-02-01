package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddToCart {
	
	WebDriver driver;
	@Given("^the user is in greenkart home page \"([^\"]*)\"$")
	public void the_user_is_in_greenkart_home_page(String url) throws Throwable {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthick\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	
				
	}

	@When("^the user added items \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" to cart$")
	public void the_user_added_items_to_cart(String item1, String item2, String item3) throws Throwable {
		
		String myXpath = "//h4[contains(text(),'$$$')]//following::div[2]";
		String product1 = myXpath.replace("$$$", item1);
		String product2 = myXpath.replace("$$$", item2);
		String product3 = myXpath.replace("$$$", item3);

		driver.findElement(By.xpath(product1)).click();
		driver.findElement(By.xpath(product2)).click();
		driver.findElement(By.xpath(product3)).click();

	}

	@Then("^the item \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" should be added to the cart$")
	public void the_item_should_be_added_to_the_cart(String item1, String item2, String item3) throws Throwable {
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	
		String xPath = "//p[contains(text(),'$$$')]";
		String product1 = xPath.replace("$$$", item1);
		String product2 = xPath.replace("$$$", item2);
		String product3 = xPath.replace("$$$", item3);
		
		Assert.assertTrue(product1.contains(item1));
		Assert.assertTrue(product2.contains(item2));
		Assert.assertTrue(product3.contains(item3));

		driver.close();
	}	
	

}



