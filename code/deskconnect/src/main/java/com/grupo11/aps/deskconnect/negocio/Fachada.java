package com.grupo11.aps.deskconnect.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

// import java.util.List;

@Component
public class Fachada {
    @Autowired
    private ControladorConta controladorConta;

    @Autowired
    private ControladorOcorrencia controladorOcorrencia;

    @Autowired
    private ControladorFuncionario controladorFuncionario;

    public void inserirOcorrencia(Ocorrencia ocorrencia) {
        controladorOcorrencia.inserir(ocorrencia);
    }

    public void inserirConta(Conta conta) {
        controladorConta.inserir(conta);
    }

    public List<Ocorrencia> getOcorrencias() { return controladorOcorrencia.getOcorrencias(); }

    public List<Conta> getContas() { return controladorConta.getContas(); }

    public void inserirFuncionario(Funcionario createdFuncionario) {
        controladorFuncionario.inserir(createdFuncionario);
    }
}
