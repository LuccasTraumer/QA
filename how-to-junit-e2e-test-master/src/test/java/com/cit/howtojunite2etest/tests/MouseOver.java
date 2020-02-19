package com.cit.howtojunite2etest.tests;

import com.cit.howtojunite2etest.suporte.Navegador;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MouseOver {
    private WebDriver navegador;

    @Before
    public void before () {
        this.navegador = Navegador.criarNavegador();
    }

    /* url da página de teste: https://automacaocombatista.herokuapp.com/mudancadefoco/janela */
    @Test
    public void validarMouseOver () {

        /* implementar e teste automatizado para a validação abaixo */
        this.navegador.get("https://automacaocombatista.herokuapp.com/iteracoes/mousehover");
        this.navegador.findElement(By.xpath(""));
        String result = this.navegador.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[3]/p")).getText();
        Assert.assertEquals("Você usou o mouse hover!", result);
    }

    @After
    public void after () {
        this.navegador.quit();
    }
}
