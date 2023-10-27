package MyRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/Sujitha V/eclipse-workspace/seleniumautomation/src/main/java/Features/login.feature", //the path of the feature files
        glue={"stepDefinitions"},
        plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
        monochrome = true,
        strict = true
)

public class TestRunner {

}
	


	

