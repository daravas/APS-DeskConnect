package com.grupo11.aps.deskconnect.negocio.observer;

import java.util.List;

public class Notificacao implements EventListener {

  @Override
  public void notify(String eventType, List<String> listaFuncionarios) {
    System.out.println("Recuperar o funcionario do Banco de Dados");
    System.out.println("Atualizar a lista de notificacoes");
    System.out.println("Salvar o funcionario no Banco de Dados");
  }

}
