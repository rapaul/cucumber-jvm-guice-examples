package test;

import com.google.inject.Inject;

import cucumber.api.java.en.Given;

public class HasTransitiveDependenciesStepdefs {
	
	@Inject
	public HasTransitiveDependenciesStepdefs(IHaveTransitiveDependencies hasDependencies) {
		
	}

	@Given("^I depend on something that has transitive dependencies$")
	public void I_depend_on_something_that_has_transitive_dependencies() throws Throwable {
	}
}
