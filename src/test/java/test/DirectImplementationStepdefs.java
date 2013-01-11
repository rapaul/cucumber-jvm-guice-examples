package test;

import com.google.inject.Inject;

import cucumber.api.java.en.Given;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class DirectImplementationStepdefs {
	
	private Fareweller fareweller;

	@Inject
	public DirectImplementationStepdefs(Fareweller fareweller) {
		this.fareweller = fareweller;
	}
	
	@Given("^my dependency doesn't have an interface$")
	public void my_dependency_doesn_t_have_an_interface() throws Throwable {
		assertThat(this.fareweller.farewell(), is("Bye"));
	}

}
