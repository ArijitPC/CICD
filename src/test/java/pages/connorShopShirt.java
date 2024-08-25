package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class connorShopShirt {
    WebDriver driver;
    By shirtWebelement = By.xpath("//*/h1[@class='categoryName-3OM']");
    By domShirt = By.xpath("//*/img[@alt='Dom Shirt']");
    By sizeS= By.xpath("//*/button[@title='S']");
    By addToBag = By.xpath("//*[contains(text(),'Add to Bag')]");
    By buttonProceedToCheckout = By.xpath("//*[contains(text(),'Proceed to Checkout')]");
    public connorShopShirt(WebDriver driver){
        this.driver = driver;
    }
    public void confirmShirtPageLoaded(){
        driver.findElement(shirtWebelement);

    }
    public void checkoutShirt() throws InterruptedException {
        driver.findElement(domShirt).click();
        driver.findElement(sizeS).click();
        driver.findElement(addToBag).click();
        driver.findElement(buttonProceedToCheckout).click();

    }


}
