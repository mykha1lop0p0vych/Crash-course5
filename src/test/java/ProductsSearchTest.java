import com.opencart.navigation.Navigation;
import com.opencart.pages.HeaderPage;
import com.opencart.pages.ProductContainer;

import com.opencart.pages.SearchResultPage;
import org.testng.annotations.Test;

import java.util.List;


import static com.opencart.enums.URLs.BASE_URL;

public class ProductsSearchTest extends BaseTest{
    @Test
    public void productsSearch() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        new HeaderPage().getInputSearchCriteria().sendKeys("Samsung");

        new HeaderPage().getInputSearchGroupButton().click();
        List<ProductContainer> productContainers = new SearchResultPage().getProductContainers();
        System.out.println();
    }
}


