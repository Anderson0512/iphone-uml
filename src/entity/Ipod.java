package entity;

import interfaces.Mp3Player;

public class Ipod implements Mp3Player {

  @Override
  public void tocar() {
    System.out.println("Tocando música pelo Ipod");
  }

  @Override
  public void pausar() {
    System.out.println("Música pausada no Ipod");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Próxima música selecionada no Ipod");
  }
}
