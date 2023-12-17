package com.grupo11.aps.deskconnect.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ControladorOcorrencia {

    @Autowired
    private CadastroOcorrencia cadastroOcorrencia;

    public void inserir(Ocorrencia ocorrencia) {
        cadastroOcorrencia.inserir(ocorrencia);
    }

    // TODO: colocar aqui o resto da implementacao que esta em CadastroOcorrencia
    public List<Ocorrencia> listaOcorrencias() {
        return cadastroOcorrencia.listaOcorrencias();
    }

}
