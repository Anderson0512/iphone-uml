package entity;

import interfaces.Mp3Player;
import interfaces.Telefone;
import interfaces.WebBrowser;

public class SmartPhone implements Mp3Player, Telefone, WebBrowser {

  @Override
  public void tocar() {
    System.out.println("Tocando música pelo Iphone");
  }

  @Override
  public void pausar() {
    System.out.println("Música pausada no Iphone");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Próxima música selecionada no Iphone");
  }

  @Override
  public void ligar() {
    System.out.println("Ligando Iphone..... Ligado");
  }

  @Override
  public void atender() {
    System.out.println("Ligação recebida, atender.");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Você tem mensagens na caixa postal. Iniciar correio de voz.");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Clicando no ícone na tela..., exibir página");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionar nova aba no web browser no iphone");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("atualizar página no iphone");
  }
}
