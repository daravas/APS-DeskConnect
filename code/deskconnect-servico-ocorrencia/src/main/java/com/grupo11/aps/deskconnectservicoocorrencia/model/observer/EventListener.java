package com.grupo11.aps.deskconnectservicoocorrencia.model.observer;

import java.util.List;

// limpeza, gerência, alimentação e hospedagem

public interface EventListener {
  public void notify(String eventType, List<String> listaFuncionarios);
}
