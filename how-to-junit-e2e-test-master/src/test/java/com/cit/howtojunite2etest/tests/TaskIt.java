package com.cit.howtojunite2etest.tests;

import com.cit.howtojunite2etest.suporte.Navegador;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class TaskIt {
    private WebDriver navegador;

    @Before
    public void before () {
        this.navegador = Navegador.criarNavegador();
    }

    /* url da página de teste: http://www.juliodelima.com.br/taskit */
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario () throws InterruptedException {
        this.navegador.get("http://www.juliodelima.com.br/taskit");

        // Clicar no link "Sign in"
        this.navegador.findElement(By.className("modal-trigger")).click();

        // Mudar o foco para a modal de Login
        this.navegador.findElement(By.id("signinbox"));
        WebElement result = this.navegador.findElement(By.id("signinbox"));

        // Digitar no campo "login" (dentro do formulário) o texto "julio0001"
        result.findElement(By.name("login")).sendKeys("julio0001");

        // Digitar no campo "password" (dentro do formulário) o texto "123456"
        result.findElement(By.name("password")).sendKeys("123456");

        // Clicar no link "SIGN IN"
        result.findElement(By.className("modal-footer"));
        Thread.sleep(1000);
        this.navegador.findElement(By.xpath("/html/body/div[4]/div[2]/a")).click();

        // Clicar no no link "me"
        this.navegador.findElement(By.className("me")).click();


        // Clicar no link  "MORE DATA ABOUT YOU"
        result.findElement(By.className("col s12"));
        result.findElement(By.linkText("MORE DATA ABOUT YOU"));

        // Clicar no botão "+ ADD MORE DATA"

        // Mudar o foco para a modal de formulário para adicionar mais dados

        // Escolher a opção Phone no combobox de type

        // No campo de "contact" digitar "+5511999999999"

        // Clicar no link "SAVE" que está na popup

        // Na mensagem validar que o texto é "Your contact has been added!"
        String ret = this.navegador.findElement(By.xpath("/html/body/div[5]/div")).getText();
        //Alert alert = this.navegador.switchTo().alert();
        //String result = alert.getText();

        Assert.assertEquals("Your contact has been added!",ret);

        this.after();

    }

    @After
    public void after () {
        this.navegador.quit();
    }
}
