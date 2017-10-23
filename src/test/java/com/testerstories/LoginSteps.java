package com.testerstories;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {
	public static String driverPath = "C:\\Users\\vicente.llanos\\eclipse-workspace\\cucumber_test\\src\\test\\resources\\geckodriver-v0.19.0-win64\\";
	public static String baseURL = "https://www.heroku.com/home";
	WebDriver driver;

	@Given("^the Heroku home page$")
	public void the_Symbiote_home_page() throws Throwable {
		driver.get(baseURL);
		assertEquals("Cloud Application Platform | Heroku", driver.getTitle());
	}

	@When("^click on the signup button$")
	public void logging_in_as_an_admin() throws Throwable {
		WebElement signUp = driver.findElement(By.cssSelector(".sign-up.highlight"));
		signUp.click();

//		WebElement username = driver.findElement(By.id("username"));
//		username.sendKeys("admin");
//
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("admin");
//
//		WebElement login = driver.findElement(By.id("login-button"));
//		login.submit();
	}
	
	@And("^user enters username: and password$")
	public void user_enters_first_name_and_last_name() throws Throwable {
		WebElement signUp = driver.findElement(By.cssSelector(".sign-up.highlight"));
		signUp.click();

//		WebElement username = driver.findElement(By.id("username"));
//		username.sendKeys("admin");
//
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("admin");
//
//		WebElement login = driver.findElement(By.id("login-button"));
//		login.submit();
	}
	
	

	@Then("^the home page navigation is available$")
	public void the_home_page_navigation_is_available() throws Throwable {
		WebElement headerLoginDiv = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.className("header-login")));
	}

	@Before
	public void startUp() {
		System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}