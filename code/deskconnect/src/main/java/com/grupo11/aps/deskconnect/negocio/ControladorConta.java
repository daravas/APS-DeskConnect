package com.grupo11.aps.deskconnect.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ControladorConta {
    private CadastroConta cadastroConta;

    @Autowired
    public ControladorConta(CadastroConta cadastroConta) {
        this.cadastroConta = cadastroConta;
    }

    public void inserir(Conta conta) {
        cadastroConta.inserir(conta);
    }

    public List<Conta> getContas() { return cadastroConta.getContas(); }
}
