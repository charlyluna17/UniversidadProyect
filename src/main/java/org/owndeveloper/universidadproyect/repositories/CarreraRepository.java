package org.owndeveloper.universidadproyect.repositories;


import org.owndeveloper.universidadproyect.models.Carrera;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CarreraRepository extends CrudRepository<Carrera,Integer> {

    Iterable<Carrera> findCarrerasByNombreContains(String nombre);
    Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre);
    Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidad);
    @Query("SELECT c FROM Carrera c JOIN FETCH c.profesores p WHERE p.nombre = ?1 AND p.apellido = ?2")
    Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido);
}
