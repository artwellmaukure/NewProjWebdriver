package stepsdef;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class StepDefination {

    WebDriver driver;
    String siteurl = "https://www.google.com";
    String expectedTitle = "Google";

    @Given("I launch brwser")
    public void i_launch_brwser() {

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get(siteurl);
        driver.manage().window().maximize();

    }
    @When("I Login into google page")
    public void i_login_into_google_page() {
       System.out.println("I have jus logged onto google page");
    }
    @When("I Verify Title Page")
    public void i_verify_title_page() {

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Then("I close browser")
    public void i_close_browser() {
        System.out.println("The browser is now closing");
        driver.close();
    }
}
