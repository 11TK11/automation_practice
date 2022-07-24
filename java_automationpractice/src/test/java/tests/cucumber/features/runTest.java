package tests.cucumber.features;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html"},
        features = {"src/test/java/tests"},
        glue={"src/test/java/tests/cucumber/steps"}
)

//Specifying pretty as a format option ensure that HTML report will be generated.
//When we specify html:target/Destination - It will generate the HTML report

public class runTest { }