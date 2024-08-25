package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class connorHomePage {
    WebDriver driver;
    By connorWebelement = By.xpath("//*/img[@loading ='lazy'][@title = 'Connor | Men’s Clothing & Accessories Online']");
    By shopShirt = By.xpath("//*/img[@src='https://mcprod2.connor.com.au/media/wysiwyg/Slice_23_2.jpg']");
    By NEW = By.xpath("//a[text()=\"NEW\"]");
    By CLOTHING = By.xpath("//a[text()=\"CLOTHING\"]");
    By SUITING = By.xpath("//a[text()=\"SUITING\"]");
    By SHOES = By.xpath("//a[text()=\"SHOES\"]");
    public connorHomePage(WebDriver driver){
         this.driver = driver;
    }
    public void confirmIsPageLoaded(){
        driver.findElement(connorWebelement);
    }

    public void clickShopShirt(){
        driver.findElement(shopShirt).click();
    }
    public void clickNew(){driver.findElement(NEW).click();}
    public void clickCLOTHING(){driver.findElement(CLOTHING).click();    }
    public void clickSUITING(){driver.findElement(SUITING).click();}
    public void clickSHOES(){driver.findElement(SHOES).click();}

}
