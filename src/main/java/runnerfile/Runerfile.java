package runnerfile;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/Features/Google.feature",
        glue = "stepsdef"


        )
public class Runerfile extends AbstractTestNGCucumberTests {
}
