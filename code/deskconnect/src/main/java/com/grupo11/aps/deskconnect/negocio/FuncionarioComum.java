package com.grupo11.aps.deskconnect.negocio;

import jakarta.persistence.OneToOne;

public class FuncionarioComum extends Funcionario {

    // @OneToOne
    // private Funcionario gerente;
    public FuncionarioComum(String nome, String cpf, String funcao, Double salario, String setor) {
        super(nome, cpf, funcao, salario, setor);
    }

}
