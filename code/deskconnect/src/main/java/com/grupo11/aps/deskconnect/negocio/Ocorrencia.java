package com.grupo11.aps.deskconnect.negocio;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
public class Ocorrencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Instant dataInicio;
    private Instant dataFim;
    private Instant dataCriacao;
    private String setor;
    @ManyToOne
    private Funcionario responsavel;

    public Ocorrencia() {
    }

    public Ocorrencia(String descricao, Instant dataInicio, Instant dataFim, Instant dataCriacao, String setor, Funcionario responsavel) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.dataCriacao = dataCriacao;
        this.setor = setor;
        this.responsavel = responsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Instant getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Instant dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Instant getDataFim() {
        return dataFim;
    }

    public void setDataFim(Instant dataFim) {
        this.dataFim = dataFim;
    }

    public Instant getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Instant dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
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
