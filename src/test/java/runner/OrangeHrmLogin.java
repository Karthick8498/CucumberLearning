<<<<<<< HEAD
package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OrangeHrmLogin {
	WebDriver driver = new ChromeDriver();

	@Given("^The user is in Orange HRM page \"([^\"]*)\"$")
	public void the_user_is_in_Orange_HRM_page(String url) throws Throwable {
	
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
	}

	@When("^The user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and(String userName, String password) throws Throwable {
	   
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

	@Then("^The user should be landed in home page$")
	public void the_user_should_be_landed_in_home_page() throws Throwable {
	   
		String text = driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).getText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Welcome"));
	}
}
=======
package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OrangeHrmLogin {
	WebDriver driver = new ChromeDriver();

	@Given("^The user is in Orange HRM page \"([^\"]*)\"$")
	public void the_user_is_in_Orange_HRM_page(String url) throws Throwable {
	
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
	}

	@When("^The user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and(String userName, String password) throws Throwable {
	   
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

	@Then("^The user should be landed in home page$")
	public void the_user_should_be_landed_in_home_page() throws Throwable {
	   
		String text = driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).getText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Welcome"));
	}
}
>>>>>>> f5db8fa04558cd2c6170dab5546f6d01ee48559c
