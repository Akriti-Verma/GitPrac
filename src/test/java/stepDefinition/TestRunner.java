package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Alljavaprograms\\BDD_Cucumber\\src\\test\\resources\\Feature\\TC001.feature", glue = {
		"stepDefinition" },

		plugin = {"pretty", "junit:target/JunitReports/reports.xml", 
				"json:target/JSONReports/reports.json",
				"html:target/HtmlReports/reports.html"},

tags ="@smoketest"

)

public class TestRunner {

}
