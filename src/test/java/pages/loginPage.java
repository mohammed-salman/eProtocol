package pages;

//import StepDefinitions.HooksDemoSteps;
import Utils.ReadPDF;
import Utils.ReadPropertiesFile;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import jakarta.inject.Inject;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class loginPage {

	protected WebDriver driver;
	@Inject
	ReadPDF _readPDF;

	private By txt_username = By.xpath("//input[@name='userId']");
	
	private By txt_password = By.xpath("//input[@name='password']");
	
	private By btn_login = By.xpath("//li[@id='new-button']/a[normalize-space()='Login']");
	
	private By btn_logout = By.id("logout");




	
	public loginPage(WebDriver driver) throws IOException {

		this.driver = driver;


//		if(!driver.getTitle().equals("TestProject Demo")) {
//
//			throw new IllegalStateException("This is not Login Page. The Current page is "
//			+driver.getCurrentUrl());
		//}

	}



	
	public void enterUsername(String username) throws IOException {



		//int report=new ExtentHtmlReporter(driver)
		driver.findElement(txt_username).sendKeys((new ReadPropertiesFile().getProperty().getProperty("username")));
	}
	public void enterPassword(String password) throws IOException {
		
		driver.findElement(txt_password).sendKeys(new ReadPropertiesFile().getProperty().getProperty("password"));

	}
	
	public void clickLogin() {
		
		driver.findElement(btn_login).click();
	}
	
	public void checkLogOutIsDisplayed() {
		
		driver.findElement(btn_logout).isDisplayed();
	}
	
	public void loginValidUser(String username, String password) throws IOException {
		
		driver.findElement(txt_username).sendKeys();
		driver.findElement(txt_password).sendKeys();
		driver.findElement(btn_login).click();
	}



}
