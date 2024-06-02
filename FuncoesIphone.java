package IPHONE;

import IPHONE.AparelhoTelefonico.AparelhoTelefonico;
import IPHONE.NavegadorInternet.NavegadorInternet;
import IPHONE.ReprodutorMusical.ReprodutorMusical;

/**
 *
 * @author jc456
 */
public class FuncoesIphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    // Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }

    // Navegar na Internet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na internet.");
    }

    @Override
    public void novaAba() {
        System.out.println("Abrindo nova aba no navegador.");
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechando aba.");
    }

    @Override
    public void atualizarAba() {
        System.out.println("Atualizando aba.");
    }

    // Ações do aparelho telefônico
    public void ligar() {
        System.out.println("Ligando iPhone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
