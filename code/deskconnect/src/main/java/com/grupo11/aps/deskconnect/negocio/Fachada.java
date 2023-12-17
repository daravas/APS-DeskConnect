package com.grupo11.aps.deskconnect.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fachada {
    @Autowired
    private ControladorConta controladorConta;
    @Autowired
    private ControladorOcorrencia controladorOcorrencia;

    public void inserirOcorrencia(Ocorrencia ocorrencia) {
        controladorOcorrencia.inserir(ocorrencia);
    }

    // TODO: inserir o resto das operacoes
    // TODO: fazer a comunicacao com as views
}
