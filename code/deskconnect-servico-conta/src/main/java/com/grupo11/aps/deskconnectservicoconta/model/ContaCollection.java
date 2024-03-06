package com.grupo11.aps.deskconnectservicoconta.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class ContaCollection {
    
    @Autowired
    private IRepositorioConta repositorioConta;

    public void inserir(Conta conta) {
        repositorioConta.inserir(conta);
    }

    public List<Conta> getContas() {
        return repositorioConta.getContas();
    }
}

