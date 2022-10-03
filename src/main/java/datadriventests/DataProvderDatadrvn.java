package datadriventests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvderDatadrvn {
    WebDriver driver;
    String siteurl = "https://icehrm-open.gamonoid.com/login.php?logout=1";
    String expectedTitle ="ICE Hrm";

    @BeforeMethod
    public void setup() throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get(siteurl);
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @Test(dataProvider = "loginData")
    public void Logintest(String user,String pwd){

        driver.findElement(By.id("username")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);


    }

    @DataProvider(name="loginData")
    public String[][] getData(){
        String loginData[][]={
                {"admin","admin"},
                {"manager","demouserpwd"},
                {"user1", "demouserpwd"},
                {"user2","demouserpwd"}

        };
        return loginData;

    }
    @AfterMethod
    public void tearDown(){

        driver.close();
    }
}
