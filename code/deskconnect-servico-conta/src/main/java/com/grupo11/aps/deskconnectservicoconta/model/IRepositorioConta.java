package com.grupo11.aps.deskconnectservicoconta.model;

import java.util.List;

public interface IRepositorioConta {
    public void inserir(Conta conta);
    List<Conta> getContas();
    Conta getConta(Long id);
}
