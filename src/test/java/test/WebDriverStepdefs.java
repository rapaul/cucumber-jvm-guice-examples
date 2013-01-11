package test;

import org.openqa.selenium.WebDriver;

import com.google.inject.Inject;

import cucumber.api.java.en.Given;

public class WebDriverStepdefs {
	
	private WebDriver webDriver;

	@Inject
	public WebDriverStepdefs(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	@Given("^I am running Firefox WebDriver$")
	public void I_am_running_Firefox_WebDriver() {
		webDriver.navigate().to("http://example.com");
	}

}
