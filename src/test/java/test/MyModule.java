package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.inject.Binder;
import com.google.inject.Module;

public class MyModule implements Module {

	public void configure(Binder binder) {
		binder.bind(Greeter.class).to(FriendlyGreeter.class);
		binder.bind(WebDriver.class).to(FirefoxDriver.class);
	}

}
