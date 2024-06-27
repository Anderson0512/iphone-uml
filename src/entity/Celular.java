package entity;

import interfaces.Telefone;

public class Celular implements Telefone {

  @Override
  public void ligar() {
    System.out.println("\nLigando celular tijolão..... Ligado");
  }

  @Override
  public void atender() {
    System.out.println("\nLigação recebida no celular tijolão, atender.");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("\nVocê tem mensagens na caixa postal no celular. Iniciar correio de voz.");
  }
}
