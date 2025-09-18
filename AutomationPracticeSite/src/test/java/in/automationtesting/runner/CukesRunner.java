package in.automationtesting.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature",
		//features = "src/test/resources/Feature/Login",
		//features = {"src/test/resources/Feature/Login/Login.feature",
		//		"src/test/resources/Feature/Login/Login2.feature"},
		
		tags = {"@smoke,@regression","~@bug"},
		
		//extent report
		plugin = {"pretty","html:target/report", 
                 
                    },
        glue =  {"in.automationtesting.steps","in.automationtesting.runner"})
		
		

public class CukesRunner {

}