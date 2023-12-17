package com.grupo11.aps.deskconnect.dados;

import com.grupo11.aps.deskconnect.negocio.Conta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContaDAO extends JpaRepository<Conta, Long> {
}
