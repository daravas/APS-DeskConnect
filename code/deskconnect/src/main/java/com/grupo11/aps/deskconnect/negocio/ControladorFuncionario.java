package com.grupo11.aps.deskconnect.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControladorFuncionario {
    private CadastroFuncionario cadastroFuncionario;

    @Autowired
    public ControladorFuncionario(CadastroFuncionario cadastroFuncionario) { this.cadastroFuncionario = cadastroFuncionario; }
    public void inserir(Funcionario funcionario) { cadastroFuncionario.inserir(funcionario); }
}
