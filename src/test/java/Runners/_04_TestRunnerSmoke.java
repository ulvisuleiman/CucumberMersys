package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // butun senaryolarda SmokeTest tagine sahip olanlari calistir
        features = {"src/test/java/FeatureFiles"}, // klasordeki butun featurelar
        glue = {"StepDefinitions"},
        plugin = {"json:target/site/cucumber.json"}

)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
