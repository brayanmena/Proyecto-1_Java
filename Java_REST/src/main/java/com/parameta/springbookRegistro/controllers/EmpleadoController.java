package com.parameta.springbookRegistro.controllers;

import com.parameta.springbookRegistro.models.Empleado;
import com.parameta.springbookRegistro.service.CalculoFecha;
import com.parameta.springbookRegistro.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @RequestMapping(value = "api/empleados",method = RequestMethod.POST)
    public ResponseEntity<CalculoFecha>  registrarEmpleados(@Valid @RequestBody Empleado empleado){
       CalculoFecha clFecha = new CalculoFecha();
        clFecha.edadEmpleado(empleado.getFechaNacimiento());
        clFecha.vinculacionEmpleado(empleado.getFechaVinculacion());
        empleadoService.registrarEmpleado(empleado);
        return new ResponseEntity<CalculoFecha>(clFecha, HttpStatus.CREATED);
    }
}
