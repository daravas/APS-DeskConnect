package com.grupo11.aps.deskconnect.negocio;

public interface Observer {
    void addOccurrence(Ocorrencia ocorrencia);

    void removeOccurrence(Ocorrencia ocorrencia);
}
