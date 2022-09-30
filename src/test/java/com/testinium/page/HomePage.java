package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {

    Methods methods;
    public HomePage(){
        methods = new Methods();
    }
    public void home(){
        methods.waitBySecond(5);
        Assert.assertTrue(methods.isElementVisiable(By.xpath("//div[@class='logo-icon']")));

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySecond(5);
    }
}
