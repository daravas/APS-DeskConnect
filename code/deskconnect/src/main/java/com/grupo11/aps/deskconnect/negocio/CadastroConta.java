package com.grupo11.aps.deskconnect.negocio;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;


@Component
public class CadastroConta {
    private List<Conta> lista_conta = new ArrayList<>();

    public void inserir(Conta conta) {
        lista_conta.add(conta);
    }

    public List<Conta> getContas() {return lista_conta; }
}
