package fhatTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FhatFirst {

    public static void main(String args[]){

        WebDriverManager.edgedriver().setup();
        String url = "https://icehrm-open.gamonoid.com/login.php?logout=1";
        WebDriver driver = new EdgeDriver();
        driver.get(url);//launching our browser
        driver.manage().window().maximize();


        WebElement arts = driver.findElement(By.id("username"));
        arts.sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
         String artw=driver.getTitle();
         System.out.println(artw);
        driver.quit();





    }



}
