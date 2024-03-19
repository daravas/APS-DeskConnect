package com.grupo11.aps.deskconnectservicoconta.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaDAO extends JpaRepository<Conta, Long> {

  public Optional<Conta> getByLogin(String login);
}
