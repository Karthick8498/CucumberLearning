package runner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TelecomAddTariffPlans {
	WebDriver driver;
	@Given("^The user is in guru telecom tariff plan page \"([^\"]*)\"$")
	public void the_user_is_in_guru_telecom_tariff_plan_page(String url) throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthick\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@When("^The user enter the tariff \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enter_the_tariff_and(String monthlyRental, String freeLocalMinutes, String freeInternationalMinutes, String freeSMSPack, String localPerMinutesCharges, String internationalPerMinutesCharges, String smsPerCharges) throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(monthlyRental);
		driver.findElement(By.xpath("//input[@id='local_minutes']")).sendKeys(freeLocalMinutes);
		driver.findElement(By.xpath("//input[@id='inter_minutes']")).sendKeys(freeInternationalMinutes);
		driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(freeSMSPack);
		driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(localPerMinutesCharges);
		driver.findElement(By.xpath("//input[@id='inter_charges']")).sendKeys(internationalPerMinutesCharges);
		driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(smsPerCharges);
	}

	@When("^click the submit button$")
	public void click_the_submit_button() throws Throwable {
	 
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}	

	@Then("^The tariff plan should be added$")
	public void the_tariff_plan_should_be_added() throws Throwable {
	   
		boolean status = driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed();
	    Assert.assertTrue(status);
	}
}
