package org.owndeveloper.universidadporyect.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Profesor extends  Persona{

    private BigDecimal sueldo;

    public Profesor() {
    }

    public Profesor(Integer id, String nombre, String apellido, String dni, LocalDate fechaAlta, LocalDate fechaModificacion, Direccion direccion, BigDecimal sueldo) {
        super(id, nombre, apellido, dni, fechaAlta, fechaModificacion, direccion);
        this.sueldo = sueldo;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }
}
