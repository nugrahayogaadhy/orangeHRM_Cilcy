package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.homePage;
import objectRepository.loginPage;
import objectRepository.logoutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertTrue;

public class logoutAdmin extends env{

    logoutPage elementsLogout = new logoutPage();
    homePage elementsHome = new homePage();

//    @When("admin clicks on profile icon")
//    public void admin_clicks_on_profile_icon() {
//        WebElement profileIcon = driver.findElement(elementsLogout.getProfileIcon());
//        profileIcon.click();
//    }
//
//    @And("admin clicks on logout button")
//    public void admin_clicks_on_logout_button() {
//        WebElement logOut = driver.findElement(elementsLogout.getLogOut());
//        logOut.click();
//
//    }
}
