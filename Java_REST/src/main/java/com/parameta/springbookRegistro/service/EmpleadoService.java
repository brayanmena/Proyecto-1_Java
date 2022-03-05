package com.parameta.springbookRegistro.service;

import com.parameta.springbookRegistro.dao.EmpleadoDao;
import com.parameta.springbookRegistro.models.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoDao empleadoDao;
    public Empleado registrarEmpleado(Empleado empleado) {
       return empleadoDao.registrar(empleado);
    }

}
