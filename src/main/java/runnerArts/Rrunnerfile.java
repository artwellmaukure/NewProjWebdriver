package runnerArts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/Features/OrangeHRM.feature",
        glue = "orangeStep"



)
public class Rrunnerfile extends AbstractTestNGCucumberTests {
}
