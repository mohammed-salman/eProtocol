//package StepDefinitions;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import Utils.ReadPropertiesFile;
//import io.cucumber.java.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class HooksDemoSteps {
//
//	WebDriver driver;
//
//	//@Before(value="@smoke", order=1)
//	@Before(order=0)
//	public void browserSetup() throws IOException {
//
//		System.out.println("  I am inside browserSetup");
//		//System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//
//		WebDriverManager.chromiumdriver().setup();
//        ChromeOptions options=new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
//        driver.manage().deleteAllCookies();
//		driver.navigate().to(new ReadPropertiesFile().getProperty().getProperty("URL"));
//
//	}
//
//	@AfterStep
//	public void printSuccess()
//	{
//		System.out.println("successful");
//	}
//
//	@After
//	public void closeBrowser()
//	{
//		driver.close();
//	}
//
//	//@Before(order=0)
////	public void setup2() {
////		System.out.println("   I am inside setup2 \n");
////	}
//
////	@After(order=1)
////	public void teardown() {
////		System.out.println("   I am inside teardown");
////		driver.close();
////		driver.quit();
////	}
////
////	@After(order=2)
////	public void teardown2() {
////		System.out.println("  I am inside teardown2 \n");
////	}
////
////	@AfterStep
////	public void addScreenshot(){
////
////		Scenario scenario = null;
////		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
////		scenario.attach(screenshot, "image/png", "image");
////
////	}
////	@BeforeStep
////	public void beforeSteps() {
////		System.out.println("  I am inside beforeSteps ----");
////	}
////
////	@AfterStep
////	public void afterSteps() {
////		System.out.println("  I am inside asfterSteps ====");
////	}
//
////
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////	}
////
////	@When("user enters valid username and password")
////	public void user_enters_valid_username_and_password() {
////	}
////
////	@And("clicks on login button")
////	public void clicks_on_login_button() {
////	}
////
////	@Then("user is navigated to the home page")
////	public void user_is_navigated_to_the_home_page() {
////	}
//
//
//}
