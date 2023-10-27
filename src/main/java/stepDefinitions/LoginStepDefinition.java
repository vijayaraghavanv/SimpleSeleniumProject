package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.net.MalformedURLException;

public class LoginStepDefinition {

    WebDriver driver;


    @Given("^user gets logged in$")
    public void user_already_on_login_page() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        //WebDriverManager.chromedriver().setup();
//	 DesiredCapabilities capabilities=new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
//	 capabilities.setBrowserName("chrome");
        //capabilities.setCapability("options","options");
        driver = new ChromeDriver(options);
//		 driver = new RemoteWebDriver(new URL("http://52.66.250.166:4444/wd/hub"), capabilities);
        driver.get("https://selectorshub.com/");
    }


    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_selectorhub() {
        String title = driver.getTitle();
        System.out.println(title);
    }


    @Then("^user enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_username_and_password(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @And("^user clicks on testcase studio icon$")
    public void user_clicks_tcstudio() {
        String name = driver.findElement(By.xpath("//a[@target='_blank'][normalize-space()='TestCase Studio']")).getText();
        System.out.println(name);
    }

    @Then("^Close the browser$")
    public void close_the_browser() {
        driver.close();
        driver.quit();
    }
}
