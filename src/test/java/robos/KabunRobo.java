package robos;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class KabunRobo {
    WebDriver nav = new ChromeDriver();

    public void AcessandoURL(){
        nav.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        //vou maximizar a tela
        nav.manage().window().maximize();
        System.out.println("Abrindo chrome");
        nav.get("https://www.kabum.com.br/");
    }
    public void FazerLogin(){
        System.out.println("fazendo login");
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

    }
    public void FecharAnuncio(){
        nav.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //fechar anuncio
        System.out.println("Fechando anuncio");
        nav.findElement(By.cssSelector("div.sc-csuSiG.PzlDv")).click();
    }
    public void BuscarItem(){
        //buscar item
        nav.findElement(By.id("input-busca")).click();
        nav.findElement(By.id("input-busca")).sendKeys(Keys.chord("Fone de ouvido"));
        nav.findElement(By.id("input-busca")).sendKeys(Keys.ENTER);
    }
    public void ComprarFone(){
        //comprar fone
        nav.findElement(By.cssSelector("div.sc-6061e719-4.sc-6061e719-6.flAjw.gvThCo.availableFooterCard")).click();
    }
    public void IrCarrinho(){
        // ir para o carrinho
        System.out.println("Comprando item");
        nav.findElement(By.cssSelector("button.sc-f69d9ee4-0.dbLvNp.buttonGoToCart")).click();
    }
    public void Scroll(){
        //scroll

        System.out.println("movendo o scroll 1");

        WebElement targetElement = nav.findElement(By.cssSelector("input.ShippingOption-styles__InputRadio-sc-ad3dfed2-2.gqLGua.shippingOption"));
        new Actions(nav).scrollToElement(targetElement).perform();
    }
    public void EscolherFrete(){
        //clique sedex
        System.out.println("Escolhendo frete");
        nav.findElement(By.cssSelector("input.ShippingOption-styles__InputRadio-sc-ad3dfed2-2.gqLGua.shippingOption")).click();
    }
    public void Scroll2() {

        //scroll até pagamento
        System.out.println("Movendo o scroll 2");
        WebElement targetElement_a = nav.findElement(By.id("buttonGoToPayment"));
        new Actions(nav).scrollToElement(targetElement_a).perform();
    }
    public void Pagar(){
        //clique pagamento
        System.out.println("Indo para pagamento");
        nav.findElement(By.id("buttonGoToPayment")).click();
    }
}
