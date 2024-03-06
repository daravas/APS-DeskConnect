package com.grupo11.aps.deskconnectservicoocorrencia.model;


import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import com.grupo11.aps.deskconnectservicoocorrencia.model.exceptions.ResourceNotFoundException;
import com.grupo11.aps.deskconnectservicoocorrencia.model.exceptions.DatabaseException;


import java.util.Date;
import java.util.List;

@Component
public class RepositorioOcorrencia implements IRepositorioOcorrencia {
    @Autowired
    private OcorrenciaDAO ocorrenciaDAO;
    @Override
    public void inserir(Ocorrencia ocorrencia) {
        ocorrenciaDAO.save(ocorrencia);
    }

    @Override
    public void deletar(Long id) {
        try {
            ocorrenciaDAO.deleteById(id);
        } catch (EmptyResultDataAccessException e ) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    @Override
    public void alterarDataFim(Long id) {
        try {
            Ocorrencia entity = ocorrenciaDAO.getReferenceById(id);
            entity.setDataFim(new Date().toString());
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    public void alterarStatus(Long id, String statusTo) {
        try {
            Ocorrencia entity = ocorrenciaDAO.getReferenceById(id);
            // Remove this comment and the one below after creating the attribute status on db
            //entity.status = statusTo;
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    @Override
    public List<Ocorrencia> listaOcorrencias() {
        try {
            return ocorrenciaDAO.findAll();
        } catch (EntityNotFoundException e) {
            throw new RuntimeException();
        }
    }
}
