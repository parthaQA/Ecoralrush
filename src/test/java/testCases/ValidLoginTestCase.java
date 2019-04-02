package testCases;
import Base.BaseClass;
import com.Pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ValidLoginTestCase extends BaseClass {


    @Test()
    public void checkValidLogin() throws InterruptedException {

        LoginPage log_in = PageFactory.initElements(driver, LoginPage.class);
        log_in.clickMyAccount();
        log_in.clickLogin();
        log_in.login("partha.senuwsb@gmail.com", "asdf#1234");
        log_in.VerifyLoginSuccess();
    }

}


