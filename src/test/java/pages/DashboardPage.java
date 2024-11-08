package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory ']")
    public List<WebElement> items;

    @FindBy(xpath = "//span[text()='6']")
    public WebElement itemNum;

    public void addItems() {
        for (WebElement item : items) {
            item.click();
        }
    }


}
