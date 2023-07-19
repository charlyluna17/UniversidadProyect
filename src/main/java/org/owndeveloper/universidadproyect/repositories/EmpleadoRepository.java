package org.owndeveloper.universidadproyect.repositories;

import org.owndeveloper.universidadproyect.models.Empleado;
import org.owndeveloper.universidadproyect.models.Persona;
import org.owndeveloper.universidadproyect.models.enums.TipoEmpleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {

    @Query("select e from Empleado e join fetch e.tipoEmpleado where e.tipoEmpleado = :tipoEmpleado")
    Iterable<Persona> findEmpleadoByTipoEmpleado(@Param("tipoEmpleado") TipoEmpleado tipoEmpleado);
}
