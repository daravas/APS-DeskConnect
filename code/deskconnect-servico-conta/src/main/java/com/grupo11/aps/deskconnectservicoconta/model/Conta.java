package com.grupo11.aps.deskconnectservicoconta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Conta {
    @Id
    private Long id;
    private String login;
    private String senha;

    public Conta(Long id, String login, String senha) {
        this.id = id ;
        this.login = login;
        this.senha = senha;
    }
}