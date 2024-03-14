package com.grupo11.aps.deskconnectservicofuncionario.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositorioJPAFuncionario implements IRepositorioFuncionario {
    @Autowired
    private FuncionarioDAO funcionarioDAO;

    @Override
    public void inserir(Funcionario funcionario) {
        funcionarioDAO.save(funcionario);
    }
}
