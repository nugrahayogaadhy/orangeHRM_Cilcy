package stepDefinitions;

import config.env;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.homePage;
import objectRepository.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertTrue;

public class loginAdmin extends env{

    loginPage elementsLogin = new loginPage();
    homePage elementsHome = new homePage();

    @Given("admin is at orangeHRM login page")
    public void admin_is_at_orange_hrm_login_page() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Sekarang membuka url " + currentUrl);
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"))
        );

    }
    @When("admin inputs valid username")
    public void admin_inputs_valid_username() {
        WebElement inputUsernameAdmin = driver.findElement(elementsLogin.getInputUsernameAdmin());
        inputUsernameAdmin.sendKeys("admin");
    }
    @When("admin inputs valid password")
    public void admin_inputs_valid_password() {
        WebElement inputPasswordAdmin = driver.findElement(elementsLogin.getInputPasswordAdmin());
        inputPasswordAdmin.sendKeys("admin123");

    }
    @When("admin clicks on login button")
    public void admin_clicks_on_login_button() {
        int duration = 10;
        WebDriverWait wait = new WebDriverWait(driver, duration);
        WebElement buttonLogin = wait.until(ExpectedConditions.presenceOfElementLocated(elementsLogin.getButtonLogin()));
                driver.findElement(elementsLogin.getButtonLogin());
//        assertTrue(buttonLogin.isDisplayed());
        buttonLogin.click();
    }
    @Then("admin is redirected to home page")
    public void admin_is_redirected_to_home_page() throws InterruptedException {
        String assertionhomePage = driver.getCurrentUrl();
        int duration = 3;
        WebDriverWait wait = new WebDriverWait(driver, duration);
//        WebElement pimMenu = driver.findElement(elementsHome.getPimMenu());
//        assertTrue(pimMenu.isDisplayed());

        if (assertionhomePage.contains("dashboard")){
            System.out.println("success");
        }   else
        {
            System.out.println("failed");
        }
        Thread.sleep(1500);
    }
}
