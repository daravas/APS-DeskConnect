package com.grupo11.aps.deskconnect.dados;

import com.grupo11.aps.deskconnect.negocio.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaDAO extends JpaRepository<Ocorrencia, Long> {

}
