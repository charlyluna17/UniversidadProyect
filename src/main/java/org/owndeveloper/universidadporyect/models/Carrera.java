package org.owndeveloper.universidadporyect.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "carreras")
public class Carrera implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 80)
    private String nombre;
    @Column(name = "cantidad_materias")
    private Integer cantidadMaterias;
    @Column(name = "cantidad_anios")
    private Integer cantidadAnios;
    @Column(name = "fecha_alta")
    private LocalDate fechaAlta;
    @Column(name = "fecha_modificacion")
    private LocalDate fechaModificacion;

    public Carrera() {
    }

    public Carrera(Integer id, String nombre, Integer cantidadMaterias, Integer cantidadAnios) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadMaterias = cantidadMaterias;
        this.cantidadAnios = cantidadAnios;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadMaterias() {
        return cantidadMaterias;
    }

    public void setCantidadMaterias(Integer cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }

    public Integer getCantidadAnios() {
        return cantidadAnios;
    }

    public void setCantidadAnios(Integer cantidadAnios) {
        this.cantidadAnios = cantidadAnios;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaMoficacion) {
        this.fechaModificacion = fechaMoficacion;
    }

    @PrePersist
    private void antesdePersistir(){
        this.fechaAlta=LocalDate.now();
    }

    @PreUpdate
    private void antesdeUpdate(){
        this.fechaModificacion=LocalDate.now();
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidadMaterias=" + cantidadMaterias +
                ", cantidadAnios=" + cantidadAnios +
                ", fechaAlta=" + fechaAlta +
                ", fechaMoficacion=" + fechaModificacion +
                '}';
    }
}