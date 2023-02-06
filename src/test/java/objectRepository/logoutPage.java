package objectRepository;

import org.openqa.selenium.By;

public class logoutPage {

    By profileIcon = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li");

    public By getProfileIcon() {
        return profileIcon;
    }

    By logOut = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]");

    public By getLogOut() {
        return logOut;
    }
}
