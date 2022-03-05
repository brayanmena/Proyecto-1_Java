package com.parameta.springbookRegistro.dao;

import com.parameta.springbookRegistro.models.Empleado;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@Transactional
public class EmpleadoDaolmp implements EmpleadoDao{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public Empleado registrar(Empleado empleado) {
       return entityManager.merge(empleado);
    }
}
