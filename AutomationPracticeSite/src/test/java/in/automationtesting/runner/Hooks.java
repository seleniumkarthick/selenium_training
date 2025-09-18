package in.automationtesting.runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void setup() {
		System.out.println("====BEFORE====");
	}
	
	@After
	public void tearDown() {
		System.out.println("====After====");
	}

}
