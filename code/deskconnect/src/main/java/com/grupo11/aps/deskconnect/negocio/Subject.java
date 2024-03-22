package com.grupo11.aps.deskconnect.negocio;

public interface Subject {
    void addObserver(Funcionario funcionario);
    void removeObserver(Funcionario funcionario);
    void notifyObservers(Ocorrencia ocorrencia);
}