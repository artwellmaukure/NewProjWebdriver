package fhatTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArtsTest {

    WebDriver driver;
    String expectedTitle = "ICE Hrm";
    String baseurl ="https://icehrm-open.gamonoid.com/login.php?logout=1";

    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get(baseurl);
    }

    @Test
    public void logintest(){

        WebElement arts = driver.findElement(By.id("username"));
        arts.sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
        String actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);


    }

}
