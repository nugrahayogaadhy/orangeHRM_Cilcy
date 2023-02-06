package objectRepository;

import org.openqa.selenium.By;

public class homePage {

    By dashboardLogo = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]");
    public By getDashboardLogo() {
        return dashboardLogo;
    }

    By pimMenu = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']");

    public By getPimMenu() {
        return pimMenu;
    }

    By btn_punch = By.xpath("//button[contains(@class,'attendance')]");
    public By getBtn_punch() {
        return btn_punch;
    }

    By In_clock = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/button/i");

    public By getIn_clock() {
        return In_clock;
    }

    By btn_myInfo = By.xpath("//a[contains(@href,'viewMyDetails')]");
    public By getBtn_myInfo() {
        return btn_myInfo;
    }
}
