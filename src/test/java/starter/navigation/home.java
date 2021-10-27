package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://wikipedia.org")

public class home extends PageObject {


    @Override
    public WebDriver getDriver() {
        return super.getDriver();
    }
}
