package pages;

import Utils.ReadPDF;
import Utils.ReadPropertiesFile;
import Utils.Reusable;
import jakarta.inject.Inject;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.util.Date;
import java.util.function.Function;

public class eProtocol extends ReadPropertiesFile {



	protected WebDriver driver;
	@Inject
	ReadPDF _readPDF;

	@Inject
	Reusable _reUsable;

	private By txt_username = By.xpath("//input[@name='userId']");
	private By txt_password = By.xpath("//input[@name='password']");

	private By vendorDropdown = By.id("select2-vendor-container");
	private By deliveryDateDropdown = By.id("select2-deliveryDate-container");
	private By poNumber = By.id("select2-oraclePoNo-container");

	private By piContainer = By.id("select2-pi-container");
	private By protocol = By.id("select2-protocolsId-container");
	private By barCodeNo = By.id("select2-cageCardsId-container");

	private By location = By.id("select2-location-container");
	private By building = By.id("select2-building-container");
	private By room = By.id("select2-room-container");
	private By species = By.id("select2-spName-container");



	private By btn_login = By.xpath("//li[@id='new-button']/a[normalize-space()='Login']");

	private By btn_logout = By.id("logout");





	public eProtocol(WebDriver driver) throws IOException {

		this.driver = driver;

	}




	public void clickButton(String name) throws IOException {


		WebElement element=driver.findElement(By.xpath("//a[normalize-space()='"+name+"']"));
		element.click();
	}
	public void selectCheckBox(String name) throws IOException {


		//_reUsable.webDriverwait("eAnimal Ordering");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.titleIs(("eAnimal Ordering")));

		WebElement element = null;
		if(name.equals("Vendor")) {
			element = driver.findElement(By.xpath("//input[@name='level1']"));
		}
		else if(name.equals("PI"))
		{
			element = driver.findElement(By.xpath("//input[@name='level2']"));
		}
		else if(name.equals("Location"))
		{
			element = driver.findElement(By.xpath("//input[@name='level3']"));
		}
		else if(name.equals("Species"))
		{
			element = driver.findElement(By.xpath("//input[@name='level4']"));
		}
		else if(name.equals("all"))
		{
			element = driver.findElement(By.xpath("//input[@id='allIds']"));
		}
		element.click();

	}

	public void selectRadioButton(String text)
	{
		WebElement element = driver.findElement(By.xpath("//input[@name='"+text+"']"));
		element.click();
	}
	public void verifyList() throws InterruptedException {
		//WebElement element=driver.findElement(By.xpath("//font[normalize-space()='Cage Card(s)']"));
		Thread.sleep(20000);
		//waitforElement(driver.findElement(By.xpath("//img[@src='resources/application/images/core/animation_processing.gif']")));

		//	fluentWaitelement((By) driver.findElement(By.xpath("//font[normalize-space()='Bar Code No']")));
	}

	public void selectDropdown(String key,String value) throws Exception {

		try
		{
			switch(value) {
				case "Vendor":

					//waitforElement(vendorDropdown);
					driver.findElement(vendorDropdown).click();

					dynamicClick(key);

					break;

				case "Delivery date":

					driver.findElement(deliveryDateDropdown).click();
					Thread.sleep(3000);
					dynamicClick(key);
					break;

				case "PO Number":

					driver.findElement(poNumber).click();
					Thread.sleep(3000);
					dynamicClick(key);
					break;

				case "PI":

					driver.findElement(piContainer).click();
					Thread.sleep(3000);
					dynamicClick(key);
					break;

				case "Protocol":

					driver.findElement(protocol).click();
					Thread.sleep(3000);
					dynamicClick(key);
					break;

				case "barcode":

					driver.findElement(barCodeNo).click();
					Thread.sleep(3000);
					dynamicClick(key);
					break;

				case "Location":

					driver.findElement(location).click();
					Thread.sleep(3000);
					dynamicClick(key);
					break;

				case "Building":

					driver.findElement(building).click();
					Thread.sleep(3000);
					dynamicClick(key);
					break;


				case "Room":

					driver.findElement(room).click();
					Thread.sleep(3000);
					dynamicClick(key);
					break;

				case "Species":

					driver.findElement(species).click();
					Thread.sleep(3000);
					dynamicClick(key);
					break;

			}


		}
		catch (Exception e)
		{
			captureScreenShot(driver,"Screen shot 1");
			Assert.fail("Element not available");
			driver.close();
		}
	}


	public Select selectByText(By element, String value)
	{
		Select select=new Select((driver.findElement(element)));
		select.selectByVisibleText(value);

		return select;
	}

	public void dynamicClick(String text)
	{
		//WebElement element=driver.findElement(By.xpath("//li[normalize-space()='"+text+"']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[normalize-space()='"+text+"']"))));
		driver.findElement(By.xpath("//li[normalize-space()='"+text+"']")).click();

	}

	public WebElement waitforElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.invisibilityOf(element));

		return (WebElement) element;
	}

	public WebElement fluentWaitelement(By element)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30L))
				.pollingEvery(Duration.ofSeconds(5L))
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement((element));
			}
		});
		return (WebElement) element;
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

	public void clickradioButton(String name)
	{

		WebElement element = null;
		if(name.equals("DMP")) {
			element = driver.findElement(By.xpath("//input[@value='DMP']"));
		}
		else if(name.equals("LP"))
		{
			element = driver.findElement(By.xpath("//input[@value='LP']"));
		}
		else if(name.equals("No"))
		{
			element=driver.findElement(By.xpath("(//input[@id='sentinel'])[2]"));
		}

		element.click();
	}

	public void captureScreenShot(WebDriver driver, String screenshotName)
			throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./screenshots/" + screenshotName
				+ ".png"));
	}

	public static String currentDate() {
		DateFormat dftr = new SimpleDateFormat("MM-dd-yyyy");

		Date date = new Date();

		String strDate = dftr.format(date);

		return strDate;

	}



}

