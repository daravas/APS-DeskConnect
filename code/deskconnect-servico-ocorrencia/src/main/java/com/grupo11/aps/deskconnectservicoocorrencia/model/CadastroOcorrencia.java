package com.grupo11.aps.deskconnectservicoocorrencia.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CadastroOcorrencia {

    @Autowired
    private IRepositorioOcorrencia repositorioOcorrencia;

    public void inserir(Ocorrencia ocorrencia) {
        repositorioOcorrencia.inserir(ocorrencia);
    }

    public List<Ocorrencia> getOcorrencias() {
        return repositorioOcorrencia.listaOcorrencias();
    }

    public void deletar(Long id) { 
        repositorioOcorrencia.deletar(id);
    }

    public void alterarStatus(Long id, String statusTo) { 
        repositorioOcorrencia.alterarStatus(id, statusTo);
    }
}
