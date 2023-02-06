package objectRepository;

import org.openqa.selenium.By;

public class editPage {

    By dropdown_nationality = By.xpath("//*[@class='oxd-select-wrapper']/descendant::i[1]");
    public By getDropdown_nationality() {
        return dropdown_nationality;
    }

    By get_listNationality = By.xpath("//div[@role='option']/span");
    public By getGet_listNationality() {
        return get_listNationality;
    }

    public By getTxt_Nationality(String nationality) {
        By txt_nationality = By.xpath("//div[@role='option']/span[text()='"+nationality+"']");
        return txt_nationality;
    }


    By dropdown_maritalStatus = By.xpath("//label[text()='Marital Status']/following::i");
    public By getDropdown_maritalStatus() {
        return dropdown_maritalStatus;
    }

    By get_ListMaritalStatus = By.xpath("//div[@role='option']/span");
    public By getGet_ListMaritalStatus() {
        return get_ListMaritalStatus;
    }

    public By getMaritalStatus(String status) {
        By maritalStatus = By.xpath("//div[@role='option']/span[text()='"+status+"']");
        return maritalStatus;
    }

    public By getBtn_gender(String gender) {
        By btn_gender = By.xpath("//label[text()='"+gender+"']/span");
        return btn_gender;
    }

    By btn_saveAttachment = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button");
    public By getBtn_saveAttachment() {
        return btn_saveAttachment;
    }

    public By getNationality(String country)
    {
        By nationality_indonesia = By.xpath("//div[@role='option']/span[contains(text(),'" + country +")]");
        return nationality_indonesia;
    }
}
