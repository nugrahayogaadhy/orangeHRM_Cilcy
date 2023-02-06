package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import config.env;

public class hooks extends env{

    @Before
    public void before()
    {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        String webURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(webURL);
        driver.manage().window().maximize();

//        Thread.sleep(3000);

    }

    @After
    public void after()
    {
        driver.quit();
    }
}
