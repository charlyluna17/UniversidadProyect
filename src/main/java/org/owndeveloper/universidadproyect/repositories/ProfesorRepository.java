package org.owndeveloper.universidadproyect.repositories;

import org.owndeveloper.universidadproyect.models.Persona;
import org.owndeveloper.universidadproyect.models.Profesor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProfesorRepository extends CrudRepository<Profesor, Integer> {

    @Query("select p from Profesor p join p.carreras c where c.nombre = ?1")
    Iterable<Persona> findProfesorByCarrera(String carrera);
}
