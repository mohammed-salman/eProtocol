package Utils;

import StepDefinitions.eProtocolSteps;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import pages.eProtocol;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

public class Hooks {
    
//    eProtocolSteps _eprotocol;

WebDriver browser;

    public Hooks(WebDriver driver) throws IOException {

        browser = driver;
        PageFactory.initElements(browser, this);

    }

//    @Before
//   public void setupDriver() throws IOException, InterruptedException {
//        new eProtocolSteps().iNavigateToEProtocolApplication("Chrome");
//
   // }
    
//    @AfterStep
//    public void afterScenario() throws Exception {
//        new eProtocol(browser).captureScreenShot(browser,"dvsvds");
//    }
}

