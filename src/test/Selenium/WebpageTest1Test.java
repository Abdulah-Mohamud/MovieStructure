// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class WebpageTest1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void webpageTest1() {
    driver.get("http://localhost:3000/");
    driver.manage().window().setSize(new Dimension(1366, 728));
    driver.findElement(By.id("outlined-basic")).click();
    driver.findElement(By.id("outlined-basic")).sendKeys("1001");
    driver.findElement(By.cssSelector(".Mui-focused > #outlined-basic")).sendKeys("New Movie");
    driver.findElement(By.cssSelector(".Mui-focused > #outlined-basic")).sendKeys("Selenium Test");
    driver.findElement(By.cssSelector(".Mui-focused > #outlined-basic")).sendKeys("89");
    driver.findElement(By.cssSelector(".Mui-focused > #outlined-basic")).sendKeys("1");
    driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(6) > .MuiButton-label")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(4) > .MuiButton-label")).click();
  }
}
