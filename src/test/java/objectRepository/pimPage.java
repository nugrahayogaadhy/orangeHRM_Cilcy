package objectRepository;

import org.openqa.selenium.By;

public class pimPage {

    By addEmployeeMenu = By.xpath("//button[normalize-space()='Add']");

    public By getAddEmployeeMenu() {
        return addEmployeeMenu;
    }

    By fName = By.name("firstName");
//   //*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input

    public By getfName() {
        return fName;
    }

    By lName = By.name("lastName");
//    //*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input

    public By getlName() {
        return lName;
    }

    By employeeId = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");

    public By getEmployeeId() {
        return employeeId;
    }

    By checkBox = By.cssSelector(".oxd-switch-input.oxd-switch-input--active.--label-right");
//            By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/input");

    public By getCheckBox() {
        return checkBox;
    }

    By unameEmp = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");

    public By getUname() {
        return unameEmp;
    }

    By passEmp = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input");

    public By getPassEmp() {
        return passEmp;
    }

    By confirmEmp = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");

    public By getConfirmEmp() {
        return confirmEmp;
    }

    By saveBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]\n");
//    By.className("class oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space"):

    public By getSaveBtn() {
        return saveBtn;
    }

    By PIMassert = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");

    public By getPIMassert() {
        return PIMassert;
    }
}


