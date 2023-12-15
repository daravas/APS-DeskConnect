package com.grupo11.aps.deskconnect.negocio;

public class Conta {
    private Long id;
    private String login;

    public Conta(Long id, String login) {
        this.setId(id);
        this.setLogin(login);
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
}
