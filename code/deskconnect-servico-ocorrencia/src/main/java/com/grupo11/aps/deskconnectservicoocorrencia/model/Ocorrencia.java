package com.grupo11.aps.deskconnectservicoocorrencia.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Ocorrencia{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String dataCriacao;
    private String setor;
    private Long criador;

    //TODO: voltar responsavel para o tipo funcionario quando a logica de criacao de funcionario funcionar
    //@ManyToOne
    //private Funcionario responsavel;
    private String responsavel;

    public Ocorrencia() {

    }

    //TODO: responsavel deverá ser do tipo fundionário; está como string apenas para teste
    public Ocorrencia(String descricao, String dataInicio, String dataFim, String dataCriacao, String setor, String responsavel, Long criador) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.dataCriacao = dataCriacao;
        this.setor = setor;
        this.responsavel = responsavel;
        this.criador = criador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCriador() {
        return criador;
    }

    public void setCriador(Long criador) {
        this.criador = criador;
    }

    //TODO: voltar metodos de responsavel para o tipo Funcionario
    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ocorrencia that)) return false;
        return Objects.equals(descricao, that.descricao) && Objects.equals(dataInicio, that.dataInicio) && Objects.equals(dataFim, that.dataFim) && Objects.equals(dataCriacao, that.dataCriacao) && Objects.equals(setor, that.setor) && Objects.equals(responsavel, that.responsavel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, dataInicio, dataFim, dataCriacao, setor, responsavel);
    }

    @Override
    public String toString() {
        return "Ocorrencia{" +
                "descricao='" + descricao + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFim='" + dataFim + '\'' +
                ", dataCriacao='" + dataCriacao + '\'' +
                ", setor='" + setor + '\'' +
                ", responsavel=" + responsavel +
                '}';
    }
}