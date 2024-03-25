package Libary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Operations {
    public static WebElement findElement(By path, WebDriver driver){
        WebElement el = driver.findElement(path);
        return el;
    }

 public static void click(By Locator, WebDriver driver){ WebElement el= findElement(Locator,driver);
el.click();
}
}