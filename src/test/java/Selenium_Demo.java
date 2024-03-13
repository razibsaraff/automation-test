import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import java.time.Duration;

public class
Selenium_Demo {

    public static WebDriver driver;


    @BeforeTest
    public void setup() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Sign In Portal')]")).click();
        driver.findElement(By.xpath("//input[@id='usr']")).sendKeys("Razib Saraff");
        driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Razib");
        driver.findElement(By.xpath("//body/center[1]/div[1]/form[1]/input[1]")).click();
        String actualtext = driver.findElement(By.xpath("//h3[contains(text(),'Formal Shoes')]")).getText();
        System.out.println(actualtext);


        String expecttext = "Formal Shoes";
        Assert.assertEquals(actualtext, expecttext);


    }

    @AfterTest
    public void teardown() {
        driver.quit();

    }
}
