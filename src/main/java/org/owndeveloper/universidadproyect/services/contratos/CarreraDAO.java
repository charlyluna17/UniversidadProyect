package org.owndeveloper.universidadproyect.services.contratos;



import org.owndeveloper.universidadproyect.models.Carrera;

import java.util.Optional;

public interface CarreraDAO extends GenericoDAO<Carrera> {
    Iterable<Carrera> findCarrerasByNombreContains(String nombre);
    Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre);
    Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidad);
    Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido);
}
