package com.grupo11.aps.deskconnectservicoocorrencia.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OcorrenciaController {

    @Autowired
    private CadastroOcorrencia cadastroOcorrencia;

    public void inserir(Ocorrencia ocorrencia) {
        cadastroOcorrencia.inserir(ocorrencia);
    }

    // TODO: colocar aqui o resto da implementacao que esta em CadastroOcorrencia
    public List<Ocorrencia> getOcorrencias() {
        return cadastroOcorrencia.getOcorrencias();
    }

}