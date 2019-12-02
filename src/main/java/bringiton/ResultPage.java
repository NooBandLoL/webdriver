package bringiton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
    private WebDriver driver;

    public ResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
