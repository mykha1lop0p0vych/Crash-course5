import com.opencart.navigation.Navigation;
import com.opencart.steps.EditPageBL;
import com.opencart.steps.EditPasswordPageBL;
import com.opencart.steps.LoginPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;


import static com.opencart.enums.Urls.BASE_URL;

public class UserEditAccountTest extends BaseTest{

    MainPageBL mainPageBL = new MainPageBL();

    @Test
    public void runAllTests(){
        loginUserWithValidParameters();
        editUserErrorPasswordDifferentFields();
        editUserErrorPasswordEmptyFields();
        editUserPassword();
        editUserEmptyFields();
        editAlertErrorUser();
        editUser();
    }

    @Test
    public void loginUserWithValidParameters(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson();
    }

    @Test
    public void editUserErrorPasswordDifferentFields(){
        EditPasswordPageBL editPasswordPageBL = mainPageBL.getMyAccountPageBL()
                .clickOnEditPasswordButton()
                .editErrorDifferentPasswordAccount();

        editPasswordPageBL.verifyErrorEditPasswordDifferentFieldsAccount();
    }

    @Test
    public void editUserErrorPasswordEmptyFields(){
        EditPasswordPageBL editPasswordPageBL = new EditPasswordPageBL();
        editPasswordPageBL.editErrorEmptyPasswordAccount();

        editPasswordPageBL.verifyErrorEditPasswordEmptyFieldsAccount();
    }

    @Test
    public void editUserPassword(){
        EditPasswordPageBL editPasswordPageBL = new EditPasswordPageBL();
        editPasswordPageBL.editPasswordAccount();

        editPasswordPageBL.verifySuccessEditPasswordAccount();
    }

    @Test
    public void editUserEmptyFields(){
        EditPageBL editPageBL = mainPageBL.getMyAccountPageBL()
                .clickOnEditButton()
                .editEmptyFieldsAccount();

        editPageBL.verifyEditEmptyFieldsAccount();
    }

    @Test
    public void editAlertErrorUser(){
        EditPageBL editPageBL = new EditPageBL();
        editPageBL.editAlertErrorAccount();

        editPageBL.verifyEditErrorAlertAccount();
    }

    @Test
    public void editUser(){
        EditPageBL editPageBL = new EditPageBL();
        editPageBL.editAccount();

        editPageBL.verifyEditAccount();
    }

}