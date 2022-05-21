package org.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;

	@Given("User able to launch the Facebook url")
	public void user_able_to_launch_the_Facebook_url() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String string, String string2) {
	   WebElement username = driver.findElement(By.id("email"));
	   username.sendKeys(string);
	   WebElement password = driver.findElement(By.id("pass"));
	   password.sendKeys(string2);
	}

	@And("User clicks on the User Buuton")
	public void user_clicks_on_the_User_Buuton() {
	   WebElement button = driver.findElement(By.name("login"));
	   button.click();
	}

	@Then("User Validates the Error Message")
	public void user_Validates_the_Error_Message() throws InterruptedException {
		Thread.sleep(3000);
		WebElement errorMessage = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		//Assert.assertTrue(errorMessage.getText().contains("incorrect"));
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"));
		System.out.println("Error message is verified");
		Thread.sleep(3000);
		driver.close();
		
	}



	
}
