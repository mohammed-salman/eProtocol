package StepDefinitions;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("browser window is open")
	public void browser_is_open() {
		
		System.out.println("Inside Step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);


		WebDriverManager.chromiumdriver().setup();
		ChromeOptions options=new ChromeOptions();
		//driver=new ChromeOptions(options);
		options.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		
		System.out.println("Inside Step - user is on goolge search page");
		
		driver.navigate().to("https://ksidemo.keyusa.com/keyloadtest/GlbLogin.jsp?CUSTID=186");
		
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		
		System.out.println("Inside Step - user enters a text in search box");
		
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin$0pen");
		driver.findElement(By.xpath("//li[@id='new-button']/a[normalize-space()='Login']")).click();
		
		Thread.sleep(5000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		
		System.out.println("Inside Step - hits enter");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		
		System.out.println("Inside Step - user is navigated to search results");
		
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();
	}




}
