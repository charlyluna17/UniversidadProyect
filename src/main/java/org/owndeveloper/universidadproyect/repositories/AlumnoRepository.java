package org.owndeveloper.universidadproyect.repositories;

import org.owndeveloper.universidadproyect.models.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("alumnoRepository")
public interface AlumnoRepository extends PersonaRepository{

    @Query("select a from Alumno a join fetch a.carrera c where c.nombre = ?1")
    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre);
}
