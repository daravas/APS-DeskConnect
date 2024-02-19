package com.grupo11.aps.deskconnect.negocio;

public class FuncionarioFactory {
    public Funcionario createFuncionario(String tipo, String nome, String cpf, String funcao, Double salario, String setor) {
        if ("Gerente".equals(tipo)) {
            return new Gerente(nome, cpf, funcao, salario, setor);
        } else if ("FuncionarioComum".equals(tipo)) {
            return new FuncionarioComum(nome, cpf, funcao, salario, setor);
        } else {
            throw new IllegalArgumentException("Invalid employee type");
        }
    }
}
