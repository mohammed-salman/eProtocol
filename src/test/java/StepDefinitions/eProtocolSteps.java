package StepDefinitions;

import Utils.ReadPDF;
import Utils.ReadPropertiesFile;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.devtools.v102.network.Network;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import pagefactory.LoginPage_PF;
import pages.eProtocol;
import pages.loginPage;

import javax.swing.*;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

public class eProtocolSteps  {

   WebDriver driver;

    public loginPage _loginpage;

    public eProtocol _eProtocol;




    @Given("I navigate to eProtocol application {string}")
    public void iNavigateToEProtocolApplication(String Browser) throws InterruptedException, IOException {

        if(Browser.equals("Chrome")) {

            WebDriverManager.chromiumdriver().setup();
            ChromeOptions options = new ChromeOptions();
            String projectPath = System.getProperty("user.dir")+"/Downloads";
            Map<String, Object> preferences = new Hashtable<String, Object>();
          //  preferences.put("profile.default_content_settings.popups", 0);
           // preferences.put("download.prompt_for_download", "false");
            preferences.put("download.default_directory", projectPath);

            // disable flash and the PDF viewer
            //preferences.put("plugins.plugins_disabled", new String[]{
              //      "Adobe Flash Player", "Chrome PDF Viewer"});




            options.setExperimentalOption("prefs", preferences);
            options.addArguments("--remote-allow-origins=*");
//            options.addArguments("--incognito");
//            options.addArguments("--verbose");
//            options.addArguments("--disable-gpu");
            driver = new ChromeDriver(options);
        }

        else if(Browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(Browser.equals("safari"))
        {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }
       // driver.get("chrome://settings/clearBrowserData");
       // driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().to(new ReadPropertiesFile().getProperty().getProperty("URL"));



    }


    @When("Enter {string} and {string}")
    public void enterAnd(String arg0, String arg1) throws IOException {

        new loginPage(driver).enterUsername(arg0);
        new loginPage(driver).enterPassword(arg0);
    }

    @And("Click Submit Button")
    public void clickSubmitButton() throws IOException {

        new loginPage(driver).clickLogin();
    }

    @And("I click {string} button")
    public void iClickButton(String arg0) throws IOException {
        new eProtocol((driver)).clickButton(arg0);


    }


    @And("I Select {string} checkbox")
    public void iSelectCheckbox(String arg0) throws IOException {
        new eProtocol(driver).selectCheckBox(arg0);
    }

    @And("I Select {string} from {string} dropdown")
    public void iSelectFromDropdown(String arg0, String arg1) throws Exception {
        
        new eProtocol(driver).selectDropdown(arg0,arg1);
    }

    @And("I Verify the list")
    public void iVerifyTheList() throws IOException, InterruptedException {

        new eProtocol(driver).verifyList();
    }


    @And("I Select {string} radio button")
    public void iSelectRadioButton(String arg0) throws IOException {
        new eProtocol(driver).clickradioButton(arg0);
    }

    @And("I verify the PDF")
    public void iVerifyThePDF(DataTable table) throws IOException, InterruptedException {

      //  Thread.sleep(25000);
        new ReadPDF().getPdffile();
        new ReadPDF().verifyContent(table);

    }

    @Then("I close the Browser")
    public void iCloseTheBrowser() {

        driver.close();

    }



}
