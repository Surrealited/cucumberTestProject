package com.aimprosoft.pages;

import com.aimprosoft.steps.serenity.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;


import java.util.List;



@DefaultUrl("http://rozetka.com.ua/")
public class DictionaryPage extends PageObject implements Locators {


    public void looks_for(String keywords)  {
        waitABit(2000);
        $(SEARCH_FIELD).type(keywords);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void clickOnIphoneXs() {
        waitABit(2000);
        $(CLICK_ON_IPHONE_XS).click();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    public void chooseIphone(){
        waitABit(2000);
        $(CLICK_ON).click();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void chooseGOLDIphone(){
        //$(COLOR_SILVER).click();
        waitABit(2000);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        $(COLOR_SILVER).click();

    }

    public void chooseGrayIphone(){
        //$(COLOR_GRAY).click();
        waitABit(2000);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        $(COLOR_GRAY).click();
    }

    public void addIphoneToBasket()  {
        waitABit(2000);
        $(ADD_TO_BASKET).click();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void lookFor(String word){
        String nameButton = $(CHECK_THE_VISIBLE_BASKET).getText();
        Assert.assertEquals(nameButton, "Оформить заказ");
    }
}




















    //@FindBy(name = "search")
   // private WebElementFacade searchTerms;

    //@FindBy(className = "search-suggest__item")
    //private WebElement lookupButton;



    //public void enter_keywords(String keyword) throws InterruptedException {
       // searchTerms.type(keyword);
       // Thread.sleep(2000);
   // }

    //public void lookup_terms() throws InterruptedException {
        //lookupButton.click();
        //.sleep(2000);
   // }
//}

    //public void looku_terms() {
        //lookupButto.click();
    //}

    /*public List<String> getName() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());*/

