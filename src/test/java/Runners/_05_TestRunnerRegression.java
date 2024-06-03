package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest or @Regression", // butun senaryolarda SmokeTest tagine sahip olanlari calistir
        features = {"src/test/java/FeatureFiles"}, // klasordeki butun featurelar
        glue = {"StepDefinitions"}

)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}

// groupda or var ise: her hangi birisi olan cagrilir
// groupda and var ise: her iki grup adi olanlar cagrilir