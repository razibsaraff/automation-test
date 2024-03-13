import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import java.time.Duration;
import java.util. concurrent.TimeUnit;

public class Practice {
    public static WebDriver driver;




    @BeforeTest
    public void setup() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://foodipos.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[contains(text(),'Later, Thanks')]")).click();
    }

    @Test
    public void test() {

        driver.get("https://app.foodipos.com/main/login");


        driver.findElement(By.xpath(" //input[@id='email']")).click();
        driver.findElement(By.xpath(" //input[@id='email']")).sendKeys("saraff.razib@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Razib123@");
        driver.findElement(By.xpath(" //button[contains(text(),'Sign In')]")).click();
        driver.findElement(By.xpath("//tbody/tr[8]/td[8]/button[1]")).click();
//        driver.findElement(By.xpath("//span[c" +
//                "ontains(text(),'POS Invoice')]")).click();
//     driver.findElement(By.xpath("//span[contains(text(),'PC/Laptop/Tablet View')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Employee Management')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Add Employee')]")).click();
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("ViratShakibj Hossain");
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]")).sendKeys("017113906");
driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("5000");
driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Dhanmondi");
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/d                                                                                                                                                                                                                                                                                                           iv[3]/input[1]")).sendKeys("viratkkjjhk.rzsaaib@yahoo.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Razib123@");
driver.findElement(By.xpath("//input[@id='POS']")).click();
driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Employee List')]")).click();
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Accbftf10rac Def");
driver.findElement(By.xpath("//span[contains(text(),'Food Management')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Manage Add-ons')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Add Add-ons')]")).click();
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Lacckkhy-Dew");
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]")).sendKeys("100");
driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Addons List')]")).click();
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("MountainDew");
driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Restaurant Setting')]")).click();
driver.findElement(By.xpath("//textarea[@id='input-field']")).sendKeys("Basundhara R/a");
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("Kolkkata Kabab");

driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/input[1]")).sendKeys("011487485485");
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/input[1]")).sendKeys("Uttara");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saraff.razib@gmail.com");
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("123343");
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("1832822");
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/input[1]")).click();
driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[3]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'My Profile')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Reset Password')]")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Razib123@");
        driver.findElement(By.xpath("//input[@id='confirm_password']")).sendKeys("NewRazib123@");
        driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
    }


}

//   @AfterTest
//   public void teardown() {
//
//
//     driver.quit();
//////    }
///
////










