package com.testinium.page;
import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    public LoginPage(){
        methods = new Methods();
    }
    public void login(){

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySecond(2);
        methods.sendKeys(By.id("login-email"),"test");
        methods.waitBySecond(2);
        methods.sendKeys(By.id("login-password"),"test123");
        methods.waitBySecond(2);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySecond(5);
    }
}
