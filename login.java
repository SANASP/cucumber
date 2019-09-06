package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAN ASP\\Desktop\\san\\Driver\\chromedriver.exe");
		  driver=new ChromeDriver();

	}

	@And("some other precondition")
	public void some_other_precondition() {
		 driver.get("http://google.com");
	}

	@When("I complete action")
	public void i_complete_action() {
	   
	}

	@And("some other action")
	public void some_other_action() {
	   
	}

	@And("yet another action")
	public void yet_another_action() {
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	   
	}

	@And("check more outcomes")
	public void check_more_outcomes() {
	    driver.close();
	   
	}

}
