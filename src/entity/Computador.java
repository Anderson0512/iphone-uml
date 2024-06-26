package entity;

import interfaces.WebBrowser;

public class Computador implements WebBrowser {

  @Override
  public void exibirPagina() {
    System.out.println("Clicando com mouse no ícone..., exibir página no computador");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionar nova aba no web browser do computador");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("atualizar página, clique no f5 do computador");
  }
}
