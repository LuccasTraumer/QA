package com.cit.howtopageobjectse2etest.testes;

import com.cit.howtopageobjectse2etest.pages.LoginPage;
import com.cit.howtopageobjectse2etest.suporte.Navegador;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TaskIt {

    private WebDriver navegador;

    @Before
    public void before () {
        this.navegador = Navegador.criarNavegador();
    }

    @Test
    public void addMaisInformacoes () {
        this.navegador.get("http://www.juliodelima.com.br/taskit");

        String textoToast = new LoginPage(navegador)
                .clicarSignIn()
                .digitarLogin("julio0001")
                .digitarSenha("123456")
                .clicarSignIn()
                .clickMyProfile()
                .clickMoreAbout()
                .clickAdd()
                .selectPhone()
                .colocarPhone("1599999999")
                .saveContact()
                .message();

        Assert.assertEquals("Your contact has been added!", textoToast);
    }

    @After
    public void after () {
        this.navegador.quit();
    }
}
