package org.example;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

import java.time.Duration;

import static java.lang.Thread.sleep;


public class Main {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver");
        WebDriver nav = new ChromeDriver();
       // JavascriptExecutor jse = (JavascriptExecutor) nav;



        nav.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //vou maximizar a tela
        nav.manage().window().maximize();
        //acessando o site
        nav.get("https://www.kabum.com.br/");




      //clicando em login
        nav.findElement(By.linkText("LOGIN")).click();
        //user
        nav.findElement(By.cssSelector("input[type='text']")).clear();
        nav.findElement(By.cssSelector("input[type='text']")).click();
        nav.findElement(By.cssSelector("input[type='text']")).sendKeys("gabigramires@gmail.com");
        //senha
        nav.findElement(By.cssSelector("input[type='password']")).click();
        nav.findElement(By.cssSelector("input[type='password']")).sendKeys("Aranha2483@");
        //entrar
        nav.findElement(By.cssSelector("button[type='submit']")).click();
        //fechar anuncio
        nav.findElement(By.cssSelector("div[data-testid='btnClose']")).click();
        nav.findElement(By.id("input-busca")).click();
        nav.findElement(By.id("input-busca")).sendKeys(Keys.chord("Fone de ouvido"));
        nav.findElement(By.id("input-busca")).sendKeys(Keys.ENTER);

        //comprar fone
        nav.findElement(By.cssSelector("div.sc-6061e719-4.sc-6061e719-6.flAjw.gvThCo.availableFooterCard")).click();
        // ir para o carrinho
        nav.findElement(By.cssSelector("button.sc-f69d9ee4-0.dbLvNp.buttonGoToCart")).click();


        //entrar no carrinho
        //nav.findElement(By.id("linkCarrinhoHeader")).click();
        //continuar comprando
       /* nav.findElement(By.className("cNLKoS")).click();

       // jse.executeScript("scrollBy(0,-250)", "");
        //buscar item
      //nav.findElement(By.id("input-busca")).click();
        //av.findElement(By.id("input-busca")).sendKeys(Keys.chord("Fone de ouvido"));
       // nav.findElement(By.id("input-busca")).sendKeys(Keys.ENTER);
        nav.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println("Buscando item");
        nav.findElement(By.cssSelector("input[type='text']")).clear();
        nav.findElement(By.cssSelector("input[type='text']")).click();
        nav.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println("foi o click");
        nav.findElement(By.cssSelector("input[type='text']")).sendKeys("Fone de ouvido");
        System.out.println("escreveu");
        nav.findElement(By.cssSelector("input[type='text']")).sendKeys(Keys.ENTER);


        //comprar fone
        nav.findElement(By.cssSelector("div.sc-6061e719-4.sc-6061e719-6.flAjw.gvThCo.availableFooterCard")).click();
        // ir para o carrinho
        nav.findElement(By.cssSelector("button.sc-f69d9ee4-0.dbLvNp.buttonGoToCart")).click();

        //selecione o cep
       // nav.findElement(By.id("inputCep")).click();
       // nav.findElement(By.id("inputCep")).sendKeys(Keys.chord("91350070"));
       // nav.findElement(By.id("inputCep")).sendKeys(Keys.ENTER);

        //scroll
        //Thread.sleep(3000);

        WebElement targetElement = nav.findElement(By.cssSelector("input.ShippingOption-styles__InputRadio-sc-ad3dfed2-2.gqLGua.shippingOption"));
        new Actions(nav).scrollToElement(targetElement).perform();
        //clique sedex
        nav.findElement(By.cssSelector("input.ShippingOption-styles__InputRadio-sc-ad3dfed2-2.gqLGua.shippingOption")).click();


        //Thread.sleep(3000);
        //scroll até pagamento
        WebElement targetElement_a = nav.findElement(By.id("buttonGoToPayment"));
        new Actions(nav).scrollToElement(targetElement_a).perform();

        //clique pagamento
        nav.findElement(By.id("buttonGoToPayment")).click();
        //clicar no entendi
       // nav.findElement(By.id("onetrust-button-group")).click();
        //nav.findElement(By.cssSelector("div.banner-actions-container")).click();
       // nav.findElement(By.id("onetrust-button-group-parent")).click();


        //escolher frete
       // nav.findElement(By.className("shipping")).isSelected();


        // pagamento
       // nav.findElement(By.id("buttonGoToPayment")).click();*/




    }

}