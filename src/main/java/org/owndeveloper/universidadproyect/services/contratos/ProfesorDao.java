package org.owndeveloper.universidadproyect.services.contratos;

import org.owndeveloper.universidadproyect.models.Persona;

public interface ProfesorDao extends PersonaDAO{

    Iterable<Persona> findProfesorByCarrera(String carrera);
}
