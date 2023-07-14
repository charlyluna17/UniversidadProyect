package org.owndeveloper.universidadporyect.models;

import java.time.LocalDate;

public class Alumno extends Persona{

    public Alumno() {
    }

    public Alumno(Integer id, String nombre, String apellido, String dni, LocalDate fechaAlta, LocalDate fechaModificacion, Direccion direccion) {
        super(id, nombre, apellido, dni, fechaAlta, fechaModificacion, direccion);
    }
}
