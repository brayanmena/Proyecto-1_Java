package com.parameta.springbookRegistro.models;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name="empleado")
@ToString
@EqualsAndHashCode
public class Empleado {
    @Id
    @Getter @Setter @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter @Column(name="nombre")
    @NotBlank(message = "El campo nombre es obligatorio")
    private String nombre;
    @Getter @Setter @Column(name="apellido")
    @NotBlank(message = "El campo apellido es obligatorio")
    private String apellido;
    @Getter @Setter @Column(name="tipo_de_documento")
    @NotBlank(message = "El campo tipo de documento es obligatorio")
    private String tipoDocumento;
    @Getter @Setter @Column(name="numero_de_documento")
    @NotBlank(message = "El campo numero de documento es obligatorio")
    private String numeroDocumento;
    @Getter @Setter @Column(name="fecha_vencimiento")
    @NotBlank(message = "El campo fecha de nacimiento es obligatorio")
    private String fechaNacimiento;
    @Getter @Setter @Column(name="fecha_de_vinculacion")
    @NotBlank(message = "El campo fecha vinculacion es obligatorio")
    private String fechaVinculacion;
    @Getter @Setter @Column(name="cargo")
    @NotBlank(message = "El campo cargo es obligatorio")
    private String cargo;
    @Getter @Setter @Column(name="salario")
    private Double salario;
}
