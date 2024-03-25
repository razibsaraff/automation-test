package Pages.TestMethods;

import Libary.Operations;
import Pages.ObjectRepository.HomePage_ObjectRepository;
import org.openqa.selenium.WebDriver;

public class HomePage_TestMethods {
    public void guiVerification(){

    }
    public void navigateToSignInPortal(WebDriver driver){
        Operations.click(HomePage_ObjectRepository.Locator.BurgerMenu, driver);
        Operations.click(HomePage_ObjectRepository.Locator.NavigateToSignInPortal, driver);
    }
}
