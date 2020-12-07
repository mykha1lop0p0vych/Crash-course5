import com.opencart.navigation.Navigation;
import com.opencart.steps.LoginPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class LoginTest extends BaseTest {

    @Test
    public void loginUserWithValidParameters(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginWithValidParameters();
        loginPageBL.verifyLogin();
    }

    @Test
    public void loginUserWithInvalidParameters(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginWithInvalidParameters();
        loginPageBL.verifyUserIsNotLogin();

    }
}
