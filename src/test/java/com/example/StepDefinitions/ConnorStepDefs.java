package com.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.connorHomePage;
import pages.connorShopShirt;

import java.util.concurrent.TimeUnit;

public class ConnorStepDefs {

    WebDriver driver;


    @Before
    public void setDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void closeDriver() {
        driver.quit();
    }


    @Given("Given I launched Connor")
    public void givenILaunchedConnor() throws InterruptedException {
        driver.get("https://www.connor.com.au/au");
        // Thread.sleep(3000);
    }

    @Then("Connor page is loaded")
    public void connorPageIsLoaded() {
        connorHomePage ConnorHomePage = new connorHomePage(driver);
        ConnorHomePage.confirmIsPageLoaded();
    }

    @When("I click shop shirts")
    public void iClickShopShirts() throws InterruptedException {
        connorHomePage ConnorHomePage = new connorHomePage(driver);
        ConnorHomePage.clickShopShirt();

    }

    @Then("Shirts page is loaded")
    public void shirtsPageIsLoaded() {
        connorShopShirt ConnorShopShirt = new connorShopShirt(driver);
        ConnorShopShirt.confirmShirtPageLoaded();


    }

    @When("I select shirt at proceed to payout")
    public void iSelectShirtAtProceedToPayout() throws InterruptedException {
        connorShopShirt ConnorShopShirt = new connorShopShirt(driver);
        ConnorShopShirt.checkoutShirt();
    }

    @When("I click NEW")
    public void iClickNEW() throws InterruptedException {
        connorHomePage ConnorHomepage = new connorHomePage(driver);
        ConnorHomepage.clickNew();
        Thread.sleep(3000);
    }

    @When("I click CLOTHING")
    public void iClickCLOTHING() throws InterruptedException {
        connorHomePage ConnorHomepage = new connorHomePage(driver);
        ConnorHomepage.clickCLOTHING();
        Thread.sleep(3000);
    }

    @When("I click SUITING")
    public void iClickSUITING() throws InterruptedException {
        connorHomePage ConnorHomepage = new connorHomePage(driver);
        ConnorHomepage.clickSUITING();
        Thread.sleep(3000);
    }

    @When("I click SHOES")
    public void iClickSHOES() throws InterruptedException {
        connorHomePage ConnorHomepage = new connorHomePage(driver);
        ConnorHomepage.clickSHOES();
        Thread.sleep(3000);
    }
}