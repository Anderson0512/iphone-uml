package entity;

import interfaces.Telefone;

public class Celular implements Telefone {

  @Override
  public void ligar() {
    System.out.println("Ligando celular tijolão..... Ligado");
  }

  @Override
  public void atender() {
    System.out.println("Ligação recebida no celular tijolão, atender.");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Você tem mensagens na caixa postal no celular. Iniciar correio de voz.");
  }
}
