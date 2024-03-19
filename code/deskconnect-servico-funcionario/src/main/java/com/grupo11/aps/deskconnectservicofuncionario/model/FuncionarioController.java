package com.grupo11.aps.deskconnectservicofuncionario.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuncionarioController {
  
  @Autowired
  private CadastroFuncionario cadastroFuncionario;

  public void inserir(Funcionario funcionario) {
    cadastroFuncionario.inserir(funcionario);
  }

  public List<Funcionario> getFuncionarios() {
    return cadastroFuncionario.getFuncionarios();
  }
}
