package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.Duration;

public class Reusable {

    WebDriver driver;


    public Select selectByText(By element, String value)
    {
        Select select=new Select((driver.findElement(element)));
        select.selectByVisibleText(value);

        return select;
    }

    public void webDriverwait(String element)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.titleIs((element)));
    }

}
