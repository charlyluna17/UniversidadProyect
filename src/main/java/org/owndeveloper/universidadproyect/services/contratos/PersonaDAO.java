package org.owndeveloper.universidadproyect.services.contratos;



import org.owndeveloper.universidadproyect.models.Persona;

import java.util.Optional;

public interface PersonaDAO extends GenericoDAO<Persona> {

    Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido);
    Optional<Persona> buscarPorDni(String dni);
    Iterable<Persona> buscarPersonaPorApellido(String apellido);

}
