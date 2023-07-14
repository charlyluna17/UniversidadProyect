package org.owndeveloper.universidadporyect.models;

import org.owndeveloper.universidadporyect.models.enums.TipoEmpleado;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Empleado extends Persona{

    private BigDecimal sueldo;
    private TipoEmpleado tipoEmpleado;

    public Empleado() {
    }

    public Empleado(Integer id, String nombre, String apellido, String dni, LocalDate fechaAlta, LocalDate fechaModificacion, Direccion direccion, BigDecimal sueldo, TipoEmpleado tipoEmpleado) {
        super(id, nombre, apellido, dni, fechaAlta, fechaModificacion, direccion);
        this.sueldo = sueldo;
        this.tipoEmpleado = tipoEmpleado;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
}
