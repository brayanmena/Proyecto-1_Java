package com.parameta.springbookRegistro.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class CalculoFecha {
    @Getter @Setter
    private Integer ano_de_vinculacion;
    @Getter @Setter
    private Integer mes_de_Vinculacion;

    @Getter @Setter
    private Integer anos_de_edad;
    @Getter @Setter
    private Integer meses_de_edad;
    @Getter @Setter
    private Integer dias_de_edad;

    public void edadEmpleado(String fechaNaci){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNaci, formatter);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        this.anos_de_edad = edad.getYears();
        this.meses_de_edad = edad.getMonths();
        this.dias_de_edad = edad.getDays();
    }
    public void vinculacionEmpleado(String fechaVincul){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse(fechaVincul, formatter);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        this.ano_de_vinculacion = edad.getYears();
        this.mes_de_Vinculacion = edad.getMonths();
    }



}
