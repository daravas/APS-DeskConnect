package com.grupo11.aps.deskconnect.dados;

import com.grupo11.aps.deskconnect.negocio.Conta;
import org.springframework.data.repository.CrudRepository;


public interface ContaDAO extends CrudRepository<Conta, Long> {
}
