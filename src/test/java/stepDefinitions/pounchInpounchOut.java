package stepDefinitions;

import config.env;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import objectRepository.homePage;
import objectRepository.loginPage;
import objectRepository.pounchInOutPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class pounchInpounchOut extends env {
    loginPage elementsLogin = new loginPage();
    homePage elementsHome = new homePage();
    pounchInOutPage elementInOut = new pounchInOutPage();
    Faker faker = new  Faker();

    @And("user clicks on clock Punch In icon")
    public void user_clicks_on_clock_punch_in_icon()throws InterruptedException{
        WebElement In_clock = driver.findElement(elementsHome.getIn_clock());
//    WebElement btn_punch = wait.until(ExpectedConditions.presenceOfElementLocated(elementsHome.getBtn_punch()));
        In_clock.click();
        Thread.sleep(3000);

    }
    @And("user inputs notes")
    public void user_inputs_notes()throws InterruptedException {
        String notes = "Masuk";
        WebElement Input_notes = driver.findElement(elementInOut.getInput_notes());
//        WebElement Input_notes = wait.until(ExpectedConditions.presenceOfElementLocated(elementInOut.getInput_notes()));
        Input_notes.sendKeys(notes);
        Thread.sleep(3000);

    }
    @And("user clicks on In button")
    public void user_clicks_on_in_button() throws InterruptedException {
        WebElement InButton = driver.findElement(elementInOut.getInButton());
//        WebElement InButton = wait.until(ExpectedConditions.elementToBeClickable(elementInOut.getInButton()));
        Thread.sleep(2500);
        InButton.click();

    }
    @Then("user should success Punch In")
    public void user_should_success_punch_in() throws InterruptedException{
        Thread.sleep(2000);

    }
    @And("user is directed to Punch Out page")
    public void user_is_directed_to_punch_out_page() throws InterruptedException{
        WebElement punchOut_txt = driver.findElement(elementInOut.getPunchOut_txt());
        punchOut_txt.isDisplayed();
        Thread.sleep(2000);
    }
    @And("user clicks on Out button")
    public void user_clicks_on_out_button() throws InterruptedException{
//        WebElement OutButton = wait.until(ExpectedConditions.elementToBeClickable(elementInOut.getOutButton()));
        WebElement OutButton = driver.findElement(elementInOut.getOutButton());
        OutButton.click();
        Thread.sleep(2000);
    }
    @Then("user should success Punch Out")
    public void user_should_success_punch_out() throws InterruptedException{
        Thread.sleep(3000);
    }


}
