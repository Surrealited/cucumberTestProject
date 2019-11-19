package com.aimprosoft.steps.serenity;

import com.aimprosoft.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import static com.aimprosoft.pages.DictionaryPage.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    public boolean search;
    DictionaryPage dictionaryPage;

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String word){
        dictionaryPage.looks_for(word);
    }

    @Step
    public void click_on_result()  {
        dictionaryPage.clickOnIphoneXs();
    }

    @Step
    public void chooseIphoneXS() {
        dictionaryPage.chooseIphone();
    }

    @Step
    public void choose_color() {dictionaryPage.chooseGOLDIphone();
    }

    @Step
    public void choose_color_gray() {dictionaryPage.chooseGrayIphone();
    }

    @Step
    public void add_phone()  {dictionaryPage.addIphoneToBasket();
    }

    @Step
    public void searchBy(String word) {
        dictionaryPage.lookFor(word);
    }



}






