package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest or @Regression", // butun senaryolarda SmokeTest tagine sahip olanlari calistir
        features = {"src/test/java/FeatureFiles"}, // klasordeki butun featurelar
        glue = {"StepDefinitions"},
        dryRun = false, // true oldugunda testleri calistirmaz STEPleri varmi die kontrol eder
        plugin = {"html:target/site/cucumber-pretty.html"} // basit rapor
)
public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
