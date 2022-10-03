package tutorial1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class FirstProgram {

    WebDriver driver;
    String url ="https://the-internet.herokuapp.com/";

    @Test
     public void setup(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get(url);
    }



}
