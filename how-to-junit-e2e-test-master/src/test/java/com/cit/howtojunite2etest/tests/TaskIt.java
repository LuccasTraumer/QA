package com.cit.howtojunite2etest.tests;

import com.cit.howtojunite2etest.suporte.Navegador;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class TaskIt {
    private WebDriver navegador;

    @Before
    public void before () {
        this.navegador = Navegador.criarNavegador();
    }

    /* url da página de teste: http://www.juliodelima.com.br/taskit */
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario () {
        this.navegador.get("http://www.juliodelima.com.br/taskit");

        // Clicar no link "Sign in"
        this.navegador.findElement(By.className("modal-trigger")).click();

        // Mudar o foco para a modal de Login
        this.navegador.findElement(By.xpath("/html/body/div[4]"));

        // Digitar no campo "login" (dentro do formulário) o texto "julio0001"
        this.navegador.findElement(By.xpath("/html/body/div[4]/div[1]/form/div[2]/div[1]/input")).sendKeys("julio0001");
        //this.navegador.findElement(By.className("login")).sendKeys("julio0001");

        // Digitar no campo "password" (dentro do formulário) o texto "123456"
        this.navegador.findElement(By.xpath("/html/body/div[4]/div[1]/form/div[2]/div[2]/input")).sendKeys("123456");
        //this.navegador.findElement(By.className("validate")).sendKeys("123456");

        // Clicar no link "SIGN IN"
        this.navegador.findElement(By.xpath("/html/body/div[4]/div[2]/a")).click();
        //this.navegador.findElement(By.className("modal-action waves-effect waves-green btn-flat")).click();

        // Clicar no no link "me"
        this.navegador.findElement(By.className("me")).click();

        // Clicar no link  "MORE DATA ABOUT YOU"
        this.navegador.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();

        // Clicar no botão "+ ADD MORE DATA"
        this.navegador.findElement(By.xpath("/html/body/div[1]/div/div/div/div[4]/div[2]/button")).click();

        // Mudar o foco para a modal de formulário para adicionar mais dados
        this.navegador.findElement(By.xpath("/html/body/div[2]/div[1]"));

        // Escolher a opção Phone no combobox de type
        this.navegador.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/select/option[2]")).click();

        // No campo de "contact" digitar "+5511999999999"
        this.navegador.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/input")).sendKeys("+5511999999999");

        // Clicar no link "SAVE" que está na popup
        this.navegador.findElement(By.xpath("/html/body/div[2]/div[2]/a")).click();

        // Na mensagem validar que o texto é "Your contact has been added!"
        String result = this.navegador.findElement(By.xpath("/html/body/div[4]")).getText();

    }

    @After
    public void after () {
        this.navegador.quit();
    }
}
