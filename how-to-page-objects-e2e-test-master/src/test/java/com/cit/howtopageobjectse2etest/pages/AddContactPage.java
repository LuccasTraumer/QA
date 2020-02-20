package com.cit.howtopageobjectse2etest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddContactPage  extends  BasePage{

    public AddContactPage(WebDriver navegador){
        super(navegador);
    }


    public AddContactPage selectPhone(){
        navegador.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/select/option[2]")).click();
        return this;
    }
    public AddContactPage colocarPhone(String numero){
        navegador.findElement(By.name("contact")).sendKeys(numero);
        return this;
    }
    public MePage saveContact(){
        navegador.findElement(By.xpath("/html/body/div[2]/div[2]/a")).click();
        return new MePage(navegador);
    }

    public void getMessage(){
        navegador.findElement(By.id("toast-container")).getText();
    }
}
