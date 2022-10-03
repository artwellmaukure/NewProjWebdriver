package orangeStep;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class orangestepdef {

    WebDriver driver;
    String expectedTitle = "ICE Hrm";
    String siteurl = "https://icehrm-open.gamonoid.com/login.php?logout=1";

    @Given("I launch the browser")
    public void i_launch_the_browser() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get(siteurl);
        driver.manage().window().maximize();
    }

    @Given("^I enter (.*) and (.*)$")
    public void i_enter_admin_and_admin1234(String username, String password) throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        Thread.sleep(2000);

    }


    @When("I login onto the HRM page")
    public void i_login_onto_the_hrm_page() {

        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();

    }

    @When("I verify Title of the page")
    public void i_verify_title_of_the_page() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        System.out.println("The test has been executed the broser is now closing");
        driver.close();
    }
}
