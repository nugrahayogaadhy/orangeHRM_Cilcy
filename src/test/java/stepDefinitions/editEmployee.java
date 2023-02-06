package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.editPage;
import objectRepository.homePage;
import objectRepository.loginPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class editEmployee extends env {
    loginPage elementsLogin = new loginPage();
    homePage elementsHome = new homePage();
    editPage elementsEdit = new editPage();

    @When("user clicks on My Info menu")
    public void user_clicks_on_my_info_menu() throws InterruptedException{
        WebElement btn_myInfo = driver.findElement(elementsHome.getBtn_myInfo());
        btn_myInfo.click();
        Thread.sleep(2000);
    }
    @And("user clicks on Nationality")
    public void user_clicks_on_nationality() throws InterruptedException{
       WebElement dropdown_nationality = driver.findElement(elementsEdit.getDropdown_nationality());
        dropdown_nationality.click();
        Thread.sleep(2000);

    }
    @And("user select Nationality")
    public void user_select_nationality() throws InterruptedException{
        Thread.sleep(1500);

        List<WebElement> elementsNationality = driver.findElements(elementsEdit.getGet_listNationality());
        int listAmount = elementsNationality.size();

        String[] listNationality = new String[listAmount];
        int i = 1;

        for (WebElement listNameLooping : elementsNationality) {
            String getName = listNameLooping.getText();
            listNationality[i-1]= getName;
            i++;
        }

        Random random = new Random();
        int randomChoice = random.nextInt(listAmount);

        WebElement nationality = driver.findElement(elementsEdit.getTxt_Nationality(listNationality[randomChoice]));
        nationality.click();
        Thread.sleep(2000);
    }
    @And("user clicks on Marital Status")
    public void user_clicks_on_marital_status()throws InterruptedException {
//        elementsEdit
        WebElement btn_dropdown = driver.findElement(elementsEdit.getDropdown_maritalStatus());
        btn_dropdown.click();
        Thread.sleep(2000);
    }
    @And("user select Marital Status")
    public void user_select_marital_status() throws InterruptedException{
        List<WebElement> elementsMaritalStatus = driver.findElements(elementsEdit.getGet_ListMaritalStatus());
        int listAmount = elementsMaritalStatus.size();

        String[] listStatus = new String[listAmount];
        int i = 1;

        for (WebElement listNameLooping : elementsMaritalStatus) {
            String getName = listNameLooping.getText();
            listStatus[i-1]= getName;
            i++;
        }

        Random random = new Random();
        int randomChoice = random.nextInt(listAmount);

        WebElement maritalStatus = driver.findElement(elementsEdit.getMaritalStatus(listStatus[randomChoice]));
        maritalStatus.click();
        Thread.sleep(2000);
    }
    @And("user clicks on Gender")
    public void user_clicks_on_gender() throws InterruptedException{
        String[] gender = {"Male", "Female"};
        Random random = new Random();
        int randomChoice = random.nextInt(gender.length);
        Thread.sleep(2000);

    }
    @And("user select Gender")
    public void user_select_gender() throws InterruptedException{
        String[] gender = {"Male", "Female"};
        Random random = new Random();
        int randomChoice = random.nextInt(gender.length);
        WebElement btn_gender = driver.findElement(elementsEdit.getBtn_gender(gender[randomChoice]));
        btn_gender.click();
        Thread.sleep(2000);
    }
    @And("user clicks on Save button")
    public void user_clicks_on_save_button() throws InterruptedException{
       WebElement btn_save = driver.findElement(elementsEdit.getBtn_saveAttachment());
       btn_save.click();
       Thread.sleep(2000);
    }
    @Then("user is should success edit information")
    public void user_is_should_success_edit_information()throws InterruptedException {
        Thread.sleep(2000);
    }
}
