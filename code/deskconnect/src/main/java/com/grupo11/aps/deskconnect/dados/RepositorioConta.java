package com.grupo11.aps.deskconnect.dados;

import com.grupo11.aps.deskconnect.negocio.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositorioConta implements IRepositorioConta {
    @Autowired
    private ContaDAO contaDAO;

    @Override
    public void inserir(Conta conta) {
        contaDAO.save(conta);
    }


}
