package executores;
import robos.KabunRobo;


public class Executora {
    public static void main(String[] args) throws InterruptedException {
        KabunRobo kb = new KabunRobo();
        kb.AcessandoURL();
        kb.FazerLogin();
        kb.FecharAnuncio();
        kb.BuscarItem();
        Thread.sleep(3000);
        kb.ComprarFone();
        kb.IrCarrinho();
        Thread.sleep(3000);
        kb.Scroll();
        kb.EscolherFrete();
        Thread.sleep(3000);
        kb.Scroll2();
        kb.Pagar();

    }
}
