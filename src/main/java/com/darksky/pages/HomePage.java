package com.darksky.pages;

import com.darksky.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.darksky.base.BasePage.driver;
import java.util.List;

public class HomePage {

    //locators
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public static List<WebElement> itemList;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    //action methods
    public static void clickItem(String itemName){
        for (WebElement item: itemList) {
            if (item.getText().equals(itemName)){
                HelperMethods.doClick(item);
                break;
            }
        }
    }
}

