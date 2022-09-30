package com.testinium.page;
import com.testinium.methods.Methods;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.apache.logging.log4j.LogManager;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage(){
        methods = new Methods();
    }

    public void scrollAndSelect(){
        methods.sendKeys(By.name("search_keyword"),"edebiyat");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.click(By.cssSelector(".pr-img-link"));
        methods.scrollWithAction(By.cssSelector("#review-reply-button"));
        //methods.waitBySecond(5);
        methods.implicitWait(By.cssSelector("select#review-sort-selection"),10);
        methods.selectByText(By.cssSelector("select#review-sort-selection"),"Oylama (Düşük > Yüksek)");
        methods.waitBySecond(2);
    }

    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Değer: " + attribute);
        logger.info("Alnınan Text: " + attribute);
    }

    public void textControlText(){
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alnına Text: " + text);
        logger.info("Alnınan Text: " + text);
        methods.waitBySecond(2);
    }

    public void valueControlTest(){
        methods.sendKeys(By.id("search-input"),"testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan değer: " + value);
        logger.info("Alınan Text: " + value);
        Assert.assertEquals("testinium",value);
        methods.waitBySecond(2);
    }
}
