package Pages.TestCases;

import Libary.BaseClass;
import Pages.ObjectRepository.HomePage_ObjectRepository;
import Pages.TestMethods.HomePage_TestMethods;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignIn_Testcase extends BaseClass {
 HomePage_TestMethods home= new HomePage_TestMethods();
 @BeforeClass
    public void setupDriver(){
        setup();
    }
@Test()
    public void navigateToSignInPortal(){
        home.navigateToSignInPortal(driver);
    }
    @AfterTest
    public void teardownDriver(){
        teardown();
    }

}
