import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.Driver;

public class Testing {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    @BeforeMethod
    public void before(){
        Driver.getDriver().get("https://parabank.parasoft.com/parabank/login.htm");
    }

    @Test()
    public void test(){
        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("Mike123");
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Mike123" + Keys.ENTER);

    }

    @Test()
    public void test1(){
        Driver.getDriver().findElement(By.xpath("//a[.='Register']")).click();
    }

    @AfterSuite
    public void after(){
       Driver.getDriver().quit();
    }


}
