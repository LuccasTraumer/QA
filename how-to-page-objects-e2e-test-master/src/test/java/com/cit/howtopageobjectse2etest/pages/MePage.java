package com.cit.howtopageobjectse2etest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MePage extends BasePage {

    public MePage(WebDriver navegador){ super(navegador);}

    public MePage clickMoreAbout(){
        navegador.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        return this;
    }
    public AddContactPage clickAdd(){
        navegador.findElement(By.xpath("/html/body/div[1]/div/div/div/div[4]/div[2]/button")).click();
        return new AddContactPage(navegador);
    }

}
