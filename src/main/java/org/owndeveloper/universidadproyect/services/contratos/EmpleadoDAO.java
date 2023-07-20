package org.owndeveloper.universidadproyect.services.contratos;

import org.owndeveloper.universidadproyect.models.Persona;
import org.owndeveloper.universidadproyect.models.enums.TipoEmpleado;
import org.springframework.data.repository.query.Param;

public interface EmpleadoDAO extends PersonaDAO {

    Iterable<Persona> findEmpleadoByTipoEmpleado(@Param("tipoEmpleado") TipoEmpleado tipoEmpleado);
}
