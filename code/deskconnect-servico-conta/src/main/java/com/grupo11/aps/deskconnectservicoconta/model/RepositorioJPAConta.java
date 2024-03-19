package com.grupo11.aps.deskconnectservicoconta.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositorioJPAConta implements IRepositorioConta {

  @Autowired
  private ContaDAO contaDAO;
  
  @Override
  public void inserir(Conta conta) {
    contaDAO.save(conta);
  }

  @Override
  public List<Conta> getContas() {
    return contaDAO.findAll();
  }

  @Override
  public Conta getConta(Long id) {
    var conta = contaDAO.findById(id);
    if (conta.isEmpty()) {
      return null;
    } else {
      return conta.get();
    }
  }

  @Override
  public Conta getByLogin(String login) {
    var conta = contaDAO.getByLogin(login);
    System.out.println(conta);
    if (conta.isEmpty()) {
      return null;
    } else {
      return conta.get();
    }
  }
  

}
