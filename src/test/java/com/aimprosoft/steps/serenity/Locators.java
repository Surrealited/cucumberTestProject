package com.aimprosoft.steps.serenity;

public interface Locators {
    String SEARCH_FIELD = "//input[@placeholder='Я ищу...']";
    String CLICK_ON_IPHONE_XS = "//span[contains(text(),'iphone xs')]";
    String ADD_TO_BASKET = "//span[@class='pos-fix inline']//button[@class='btn-link-i']";
    String CHECK_THE_VISIBLE_BASKET = "//button[@class='btn-link-green btn-link cart-check-button']//span[@class='btn-link-i']";
    String CLICK_ON = "//div[@id='image_item139623101']//img[@class='rz-lazy-load']";
    String COLOR_SILVER = "/html/body/app-root/rz-main-app/pp-product-page/div/div/div/div/pp-tab-all/div[1]/div[2]/div[1]/pp-variants-block/div/pp-vardetail-opened-type/div/pp-color/ul/li[3]/pp-item-color/a/span";
    String COLOR_GRAY = "/html/body/app-root/rz-main-app/pp-product-page/div/div/div/div/pp-tab-all/div[1]/div[2]/div[1]/pp-variants-block/div/pp-vardetail-opened-type/div/pp-color/ul/li[2]/pp-item-color/a/span";

}
//li[3]//pp-item-color[1]//a[1]//span[1]