package com.grupo11.aps.deskconnectservicoocorrencia.model;

import java.util.List;

public interface IRepositorioOcorrencia {
    public void inserir(Ocorrencia ocorrencia);
    public void deletar(Long id);
    public void alterarDataFim(Long id);
    public List<Ocorrencia> listaOcorrencias();
    public void alterarStatus(Long id, String statusTo);
}