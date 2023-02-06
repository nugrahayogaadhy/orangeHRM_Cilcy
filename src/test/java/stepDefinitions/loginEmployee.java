package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.homePage;
import objectRepository.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginEmployee extends env {
    loginPage elementsLogin = new loginPage();
    homePage elementsHome = new homePage();
    @Given("user is at orangeHRM login page")
    public void user_is_at_orange_hrm_login_page() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Sekarang membuka url " + currentUrl);
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"))
        );


    }
    @When("user inputs valid username employee")
    public void user_inputs_valid_username_employee() {
        WebElement inputUsernameAdmin = driver.findElement(elementsLogin.getInputUsernameAdmin());
        inputUsernameAdmin.sendKeys("USERname_01");

    }
    @And("user inputs valid password employee")
    public void user_inputs_valid_password_employee() {
        WebElement inputPasswordAdmin = driver.findElement(elementsLogin.getInputPasswordAdmin());
        inputPasswordAdmin.sendKeys("PASS_word01");
    }
    @And("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException{
        int duration = 10;
        WebDriverWait wait = new WebDriverWait(driver, duration);
        WebElement buttonLogin = wait.until(ExpectedConditions.presenceOfElementLocated(elementsLogin.getButtonLogin()));
        driver.findElement(elementsLogin.getButtonLogin());
        buttonLogin.click();
        Thread.sleep(3000);
    }
    @Then("user is directed to home page")
    public void user_is_directed_to_home_page() throws InterruptedException{
        Thread.sleep(1000);
    }
    @And("user can see HRM menu")
    public void user_can_see_hrm_menu()throws InterruptedException {
        Thread.sleep(1000);
    }


}
