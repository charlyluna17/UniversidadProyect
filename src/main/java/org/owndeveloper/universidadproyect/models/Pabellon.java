package org.owndeveloper.universidadproyect.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "pabellones")
public class Pabellon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "metros_cuadrados")
    private double mts2;
    @Column(name = "nombre_pabellon", unique = true, nullable = false)
    private String nombre;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "codigoPostal", column =  @Column(name = "codigo_postal")),
            @AttributeOverride(name = "dpto", column =  @Column(name = "codigo_postal"))
    })
    @Column(name = "fecha_alta")
    private LocalDate fechaAlta;
    @Column(name = "fecha_modificacion")
    private LocalDate fechaMoficacion;

    @OneToMany(
            mappedBy = "pabellon",
            fetch = FetchType.LAZY
    )

    private Set<Aula> aulas;
    public Pabellon() {
    }

    public Pabellon(Integer id, String nombre, double mts2, LocalDate fechaAlta, LocalDate fechaMoficacion) {
        this.id = id;
        this.nombre = nombre;
        this.mts2 = mts2;
        this.fechaAlta = fechaAlta;
        this.fechaMoficacion = fechaMoficacion;
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

    public double getMts2() {
        return mts2;
    }

    public void setMts2(double mts2) {
        this.mts2 = mts2;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaMoficacion() {
        return fechaMoficacion;
    }

    public void setFechaMoficacion(LocalDate fechaMoficacion) {
        this.fechaMoficacion = fechaMoficacion;
    }

    public Set<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(Set<Aula> aulas) {
        this.aulas = aulas;
    }

    @PrePersist
    private void antesdePersistir(){
        this.fechaAlta=LocalDate.now();
    }

    @PreUpdate
    private void antesdeUpdate(){
        this.fechaMoficacion=LocalDate.now();
    }

    @Override
    public String toString() {
        return "Pabellon{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", mts2=" + mts2 +
                ", fechaAlta=" + fechaAlta +
                ", fechaUltimaMoficacion=" + fechaMoficacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pabellon pabellon = (Pabellon) o;
        return Objects.equals(id, pabellon.id) && Objects.equals(nombre, pabellon.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}
