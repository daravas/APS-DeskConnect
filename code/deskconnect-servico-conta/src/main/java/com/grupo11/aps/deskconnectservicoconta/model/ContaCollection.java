package com.grupo11.aps.deskconnectservicoconta.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class ContaCollection {
    
    @Autowired
    private IRepositorioConta repositorioConta;

    @Autowired
    private Producer producer;

    public void inserir(Conta conta) {
        repositorioConta.inserir(conta);
    }

    public List<Conta> getContas() {
        return repositorioConta.getContas();
    }

    public void logar(Conta conta) {
        conta = repositorioConta.getByLogin(conta.getLogin());
        if (conta != null) {
            conta.setLogado(true);
            repositorioConta.inserir(conta);
            producer.sendMessage(conta.getId());
        }

    }

    public Boolean isLogged(Long id) {
        Conta conta = repositorioConta.getConta(id);
        return conta != null ? conta.getLogado() : false;
    }
}

