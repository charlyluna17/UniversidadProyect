package org.owndeveloper.universidadproyect.services.contratos;

import org.owndeveloper.universidadproyect.models.Aula;
import org.owndeveloper.universidadproyect.models.Persona;
import org.owndeveloper.universidadproyect.models.enums.Pizarron;

import java.util.Optional;

public interface AlumnoDAO extends PersonaDAO {

    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre);

    /*Iterable<Aula> findAulasByPizarron(Pizarron pizarron);
    Iterable<Aula> findAulasByPabellonNombre(String nombre);
    Optional<Aula> findAulasByNroAula(Integer nroAula);*/
}
