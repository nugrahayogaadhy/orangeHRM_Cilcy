package stepDefinitions;

import com.github.javafaker.Faker;
import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.homePage;
import objectRepository.loginPage;
import objectRepository.logoutPage;
import objectRepository.pimPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

import static org.testng.AssertJUnit.assertTrue;

public class addEmployee extends env {

    loginPage elementsLogin = new loginPage();
    pimPage elementsPim = new pimPage();
    homePage elementsHome = new homePage();

    logoutPage elementsLogout = new logoutPage();

    Faker faker = new Faker();
    String lastName = faker.name().lastName();
    @And("admin is at orangeHRM home page")
    public void admin_is_at_orange_hrm_home_page() throws InterruptedException{
//        String assertionhomePage = driver.getCurrentUrl();
//
//        int duration = 10;
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        WebElement dashboardLogo = driver.findElement(elementsHome.getDashboardLogo());
//        assertTrue(dashboardLogo.isDisplayed());
//
//        if (dashboardLogo.isDisplayed()){
//            System.out.println("success");
//        }   else
//        {
//            System.out.println("failed");
//        }
    }
    @And("admin clicks on PIM menu and add employee menu")
    public void admin_clicks_on_pim_menu_and_add_employee_menu() throws InterruptedException {
        Thread.sleep(1000);
//        WebElement pimMenu = driver.findElement(elementsLogin.getPimMenu());
//        pimMenu.click();
//        WebElement addEmployeeMenu = driver.findElement(elementsPim.getAddEmployeeMenu());
//        addEmployeeMenu.click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        Thread.sleep(1500);
    }
    @And("admin input first name and last name")
    public void admin_filled_first_name_and_last_name() throws InterruptedException {
        WebElement fName = driver.findElement(elementsPim.getfName());
        fName.sendKeys("John");
        Thread.sleep(1500);
        WebElement lName = driver.findElement(elementsPim.getlName());
        lName.sendKeys(lastName);
        Thread.sleep(1500);

    }
    @And("admin filled employee id")
    public void admin_filled_employee_id()throws InterruptedException {
        String empId = "N-"+faker.number().digits(3);
        WebElement employeeId = driver.findElement(elementsPim.getEmployeeId());
        employeeId.sendKeys(empId);
        Thread.sleep(1500);

    }
    @And("admin clicks create login details")
    public void admin_clicks_create_login_details() throws InterruptedException {
        WebElement checkBox = driver.findElement(elementsPim.getCheckBox());
        checkBox.click();
        Thread.sleep(1000);

    }
    @And("admin filled username")
    public void admin_filled_username()throws InterruptedException {
        WebElement unameEmp = driver.findElement(elementsPim.getUname());
        unameEmp.sendKeys("USERname_01");
        Thread.sleep(1000);
    }
    @And("admin click status enabled")
    public void admin_click_status_enabled() {

    }
    @And("admin filled password")
    public void admin_filled_password() throws InterruptedException{
        WebElement passEmp = driver.findElement(elementsPim.getPassEmp());
        passEmp.sendKeys("PASS_word01");
        Thread.sleep(1000);
    }
    @And("admin filled confirm password")
    public void admin_filled_confirm_password()throws InterruptedException {
        WebElement confirmEmp = driver.findElement(elementsPim.getConfirmEmp());
        confirmEmp.sendKeys("PASS_word01");
        Thread.sleep(1000);
    }
    @And("admin clicks save button")
    public void admin_clicks_save_button() throws InterruptedException{
        WebElement saveBtn = driver.findElement(elementsPim.getSaveBtn());
        saveBtn.click();
        Thread.sleep(1000);
    }

    @Then("admin is redirected to PIM page")
    public void admin_is_redirected_to_pim_page() {
        int duration = 10;
        WebDriverWait wait = new WebDriverWait(driver, duration);
        WebElement PIMassert = driver.findElement(elementsPim.getPIMassert());
        assertTrue(PIMassert.isDisplayed());

        if (PIMassert.isDisplayed()){
            System.out.println("success");
        }   else
        {
            System.out.println("failed");
        }
    }

}
