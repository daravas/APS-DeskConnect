package com.grupo11.aps.deskconnect.negocio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Funcionario {
    private String nome;
    @Id
    private String cpf;
    private String funcao;
    private Double salario;

    private String setor;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String funcao, Double salario, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.salario = salario;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setSetor(String setor) { this.setor = setor; }

    public String getSetor() { return setor; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario that)) return false;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", funcao='" + funcao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
