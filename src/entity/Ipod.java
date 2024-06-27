package entity;

import interfaces.Mp3Player;

public class Ipod implements Mp3Player {

  @Override
  public void tocar() {
    System.out.println("\nTocando música pelo Ipod");
  }

  @Override
  public void pausar() {
    System.out.println("\nMúsica pausada no Ipod");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("\nPróxima música selecionada no Ipod");
  }
}
