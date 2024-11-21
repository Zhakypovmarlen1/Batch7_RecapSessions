package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.Config;
import utilities.Driver;

public class SignUpSteps {

    Faker faker = new Faker();
    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(Config.getValue("cashwiseURL"));
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Cashwise"));
    }

    @Then("user clicks on sign up button")
    public void user_clicks_on_sign_up_button() {
        Driver.getDriver().findElement(By.xpath("//div[@class='css-1riicrm']/button[.='Sign up']")).click();
    }
    @Then("user fills out all the required fields")
    public void user_fills_out_all_the_required_fields() {
        WebElement emailInput = Driver.getDriver().findElement(By.id("email_input_text"));
        String fakeEmail = faker.internet().emailAddress();
        emailInput.sendKeys(fakeEmail);
    }
    @Then("user has to verify if account is created successfully")
    public void user_has_to_verify_if_account_is_created_successfully() {
        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), Config.getValue("cashwiseURL"));
    }
}
