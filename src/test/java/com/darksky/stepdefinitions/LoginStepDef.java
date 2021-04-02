package com.darksky.stepdefinitions;

import com.darksky.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDef {

    WebDriver driver;
    By locationBox = By.xpath("//input[@type='text']");
    By searchButton= By.xpath("//a[@class='searchButton']");

    @Given("User in of the DarkSky Page")
    public void given1(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://darksky.net/");
    }

    @When("User clears the location box")
    public void when1(){
        driver.findElement(locationBox).clear();
    }

    @And("User searches their location in the search box")
    public void and1(){
        driver.findElement(locationBox).sendKeys("Cologne");
    }

    @And("User clicks to search")
    public void and2() {
        driver.findElement(searchButton).click();

    }

    @Then("Lowest and highest temperature is displayed")
    public void then1() {
        WebElement lowest = driver.findElement(By.xpath("//span[@class='low-temp-text']"));
        WebElement highest = driver.findElement(By.xpath("//span[@class='low-temp-text']"));

        lowest.isDisplayed();
        highest.isDisplayed();
    }

}
