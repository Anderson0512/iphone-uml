package entity;

import interfaces.Mp3Player;
import interfaces.Telefone;
import interfaces.WebBrowser;

public class SmartPhone implements Mp3Player, Telefone, WebBrowser {

  @Override
  public void tocar() {
    System.out.println("\nTocando música pelo Iphone");
  }

  @Override
  public void pausar() {
    System.out.println("\nMúsica pausada no Iphone");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("\nPróxima música selecionada no Iphone");
  }

  @Override
  public void ligar() {
    System.out.println("\nLigando Iphone..... Ligado");
  }

  @Override
  public void atender() {
    System.out.println("\nLigação recebida, atender.");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("\nVocê tem mensagens na caixa postal. Iniciar correio de voz.");
  }

  @Override
  public void exibirPagina() {
    System.out.println("\nClicando no ícone na tela..., exibir página");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("\nAdicionar nova aba no web browser no iphone");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("\natualizar página no iphone");
  }
}
