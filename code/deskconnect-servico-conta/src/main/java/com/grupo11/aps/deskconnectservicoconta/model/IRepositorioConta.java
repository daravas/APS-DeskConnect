package com.grupo11.aps.deskconnectservicoconta.model;

import java.util.List;

public interface IRepositorioConta {
    public void inserir(Conta conta);
    public List<Conta> getContas();
    public Conta getConta(Long id);
}
