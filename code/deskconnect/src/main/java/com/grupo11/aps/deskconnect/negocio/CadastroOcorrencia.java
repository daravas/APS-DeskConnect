package com.grupo11.aps.deskconnect.negocio;

import com.grupo11.aps.deskconnect.dados.IRepositorioOcorrencia;
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

    // TODO: colocar aqui as outras operacoes do banco de dados (RepostiorioOcorrencia)
    public List<Ocorrencia> listaOcorrencias() {
        return repositorioOcorrencia.listaOcorrencias();
    }
}
