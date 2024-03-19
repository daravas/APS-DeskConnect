package com.grupo11.aps.deskconnectservicofuncionario.model;

import java.util.List;

public interface IRepositorioFuncionario {
    public void inserir(Funcionario funcionario);
    public void deletar(Long id);
    public List<Funcionario> getFuncionarios();
}
