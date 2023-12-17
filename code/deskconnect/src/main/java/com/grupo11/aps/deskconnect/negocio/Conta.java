package com.grupo11.aps.deskconnect.negocio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Conta {
    @Id
    private Long id;
    private String login;
    private String senha;

    public Conta(Long id, String login, String senha) {
        this.setId(id);
        this.setLogin(login);
        this.setSenha(senha);
    }

    public Conta () {

    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {return senha;}
}
