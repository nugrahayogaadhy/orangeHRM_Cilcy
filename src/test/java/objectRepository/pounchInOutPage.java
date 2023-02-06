package objectRepository;

import org.openqa.selenium.By;

public class pounchInOutPage {
    By InButton = By.xpath("//button[@type='submit']");

    public By getInButton() {
        return InButton;
    }

    By Input_notes = By.xpath("//*[@placeholder='Type here']");

    public By getInput_notes() {
        return Input_notes;
    }

    By OutButton = By.xpath("//button[@type='submit']");

    public By getOutButton() {
        return OutButton;
    }

    By punchOut_txt = By.xpath("//h6[text() ='Punch Out']");

    public By getPunchOut_txt() {
        return punchOut_txt;
    }

    By Attendance = By.xpath("//h6[text() ='Attendance\n" +
            "Attendance']");

    public By getAttendance() {
        return Attendance;
    }
}
