package com.grupo11.aps.deskconnect.negocio;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

@Component
public class CadastroFuncionario {
    private List<Funcionario> lista_funcionario = new ArrayList<>();

    public void inserir(Funcionario funcionario) { lista_funcionario.add(funcionario); }

    public List<Funcionario> getFuncionarios() { return lista_funcionario; }
}
