package com.grupo11.aps.deskconnectservicofuncionario.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CadastroFuncionario {
    
    @Autowired
    private IRepositorioFuncionario repositorioFuncionario;

    public void inserir(Funcionario funcionario) {
        repositorioFuncionario.inserir(funcionario);
    }
    
    public List<Funcionario> getFuncionarios() {
        return repositorioFuncionario.getFuncionarios();
    }
}
