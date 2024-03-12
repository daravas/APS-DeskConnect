package com.grupo11.aps.deskconnect.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grupo11.aps.deskconnect.negocio.observer.EventManager;

import java.util.List;

@Component
public class ControladorOcorrencia extends EventManager {

    @Autowired
    private CadastroOcorrencia cadastroOcorrencia;

    public void inserir(Ocorrencia ocorrencia) {
        cadastroOcorrencia.inserir(ocorrencia);
        notify("limpeza", "Toalhas do Quarto 52 estão sujas");
    }

    public List<Ocorrencia> getOcorrencias() {
        return cadastroOcorrencia.getOcorrencias();
    }

}
