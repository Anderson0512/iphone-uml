package departamento;

import entity.Celular;
import entity.Computador;
import entity.Ipod;
import entity.SmartPhone;
import interfaces.Mp3Player;
import interfaces.Telefone;
import interfaces.WebBrowser;

public class Tecnologia {

  public static void main(String[] args) {

    Mp3Player mp3Player = new Ipod();
    mp3Player.tocar();
    mp3Player.pausar();
    mp3Player.selecionarMusica();

    System.out.println("*****IPOD******");

    Telefone telefone = new Celular();
    telefone.ligar();
    telefone.atender();
    telefone.iniciarCorreioVoz();

    System.out.println("*****Celular******");

    WebBrowser webBrowser = new Computador();
    webBrowser.exibirPagina();
    webBrowser.adicionarNovaAba();
    webBrowser.atualizarPagina();

    System.out.println("*****Computador******");

    System.out.println("*****Início IPHONE******");

    mp3Player = new SmartPhone();
    mp3Player.tocar();
    mp3Player.pausar();
    mp3Player.selecionarMusica();

    telefone = new SmartPhone();
    telefone.ligar();
    telefone.atender();
    telefone.iniciarCorreioVoz();

    webBrowser = new SmartPhone();
    webBrowser.exibirPagina();
    webBrowser.adicionarNovaAba();
    webBrowser.atualizarPagina();

    System.out.println("*****Fim IPHONE******");
  }
}
