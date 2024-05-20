package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
		glue= {"StepDefinitions"},
		monochrome= true,

		plugin = {"pretty", "junit:target/JUnitReports/report.xml",
				"json:target/JSONReports/report.json",
				"html:target/HtmlReports/cucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				//"html:target/HtmlReports"},
		tags= "@TC_1"
)
public class TestRunner {

}