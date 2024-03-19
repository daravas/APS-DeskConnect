package com.grupo11.aps.deskconnectservicofuncionario.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import com.grupo11.aps.deskconnectservicofuncionario.model.exceptions.DatabaseException;
import com.grupo11.aps.deskconnectservicofuncionario.model.exceptions.ResourceNotFoundException;

@Component
public class RepositorioJPAFuncionario implements IRepositorioFuncionario {
    @Autowired
    private FuncionarioDAO funcionarioDAO;

    @Override
    public void inserir(Funcionario funcionario) {
        funcionarioDAO.save(funcionario);
    }

    @Override
    public void deletar(Long id) {
        try {
            funcionarioDAO.deleteById(id);
        } catch (EmptyResultDataAccessException e ) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    @Override
    public List<Funcionario> getFuncionarios() {
        return funcionarioDAO.findAll();
    }
}
