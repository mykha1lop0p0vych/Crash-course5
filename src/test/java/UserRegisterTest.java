import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.RegisterPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserRegisterTest extends BaseTest {

    @Test
    public void registerUserWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registerPageBL.verifyUserRegistration();
    }

    @Test
    public void registerUserWithIncorrectParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPersonWithIncorrectParameters();
        registerPageBL.verifyUserRegistration();
    }

    @Test
    public void registerUserWithInvalidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPersonWithInvalidParameters();
        registerPageBL.verifyUserIsNotRegistrationFailName();
    }

    @Test
    public void registerUserWithInvalidName() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPersonWithFailName();
        registerPageBL.verifyUserIsNotRegistrationFailName();

    }

    @Test
    public void registerUserWithInvalidLastName() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPersonWithFailLastName();
        registerPageBL.verifyUserIsNotRegistrationFailLastName();

    }

    @Test
    public void registerUserWithInvalidEmail() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPersonWithFailEmail();
        registerPageBL.verifyUserIsNotRegistrationFailEmail();

    }

    @Test
    public void registerUserWithInvalidTel() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPersonWithFailTel();
        registerPageBL.verifyUserIsNotRegistrationFailTel();

    }

    @Test
    public void registerUserWithInvalidPassword() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPersonWithFailPassword();
        registerPageBL.verifyUserIsNotRegistrationFailPassword();

    }

    @Test
    public void registerUserWithUnacceptedPrivatePolicy() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPersonWithoutPrivatePolicy();
        registerPageBL.verifyUserIsNotRegistrationWithoutPrivatePolicy();
    }

    @Test
    public void registerUserWithIncorrectPasswordConfirm() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPersonWithFailPasswordConfirm();
        registerPageBL.verifyUserIsNotRegistrationWithFailPasswordConfirm();
    }



}
