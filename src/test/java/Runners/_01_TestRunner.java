package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, // buraya feature filesin path-i yazilacaktir
        glue = {"StepDefinitions"} // step definitions klasor adi yaziliyor

)
public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
