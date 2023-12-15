package com.grupo11.aps.deskconnect.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorConta {
    private CadastroConta cadastroConta;

    @Autowired
    public ControladorConta(CadastroConta cadastroConta) {
        this.cadastroConta = cadastroConta;
    }

    @PostMapping("/inserir")
    public void inserir(Conta conta) {
        cadastroConta.inserir(conta);
    }
}
