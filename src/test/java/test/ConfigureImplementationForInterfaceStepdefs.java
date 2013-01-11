package test;

import com.google.inject.Inject;

import cucumber.api.java.en.Given;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ConfigureImplementationForInterfaceStepdefs {
	
	private Greeter greeter;

	@Inject
	public ConfigureImplementationForInterfaceStepdefs(Greeter greeter) {
		this.greeter = greeter;
	}

	@Given("^I require an implementation of an interface$")
	public void I_require_an_implementation_of_an_interface() throws Throwable {
		assertThat(greeter.greet(), is("Good day!"));
	}
	
}
