package com.grupo11.aps.deskconnect.dados;

import com.grupo11.aps.deskconnect.negocio.Ocorrencia;

import java.util.List;

public interface IRepositorioOcorrencia {
    public void inserir(Ocorrencia ocorrencia);
    public void deletar(Long id);
    public void alterarDataFim(Long id);
    public List<Ocorrencia> listaOcorrencias();
}
