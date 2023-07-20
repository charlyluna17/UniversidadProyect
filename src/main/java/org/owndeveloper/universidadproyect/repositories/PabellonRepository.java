package org.owndeveloper.universidadproyect.repositories;

import jakarta.persistence.Id;
import org.owndeveloper.universidadproyect.models.Pabellon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PabellonRepository extends CrudRepository<Pabellon , Integer> {

    @Query("select p from Pabellon p where p.direccion.localidad = ?1")
    List<Pabellon> buscarPabellonPorLocalidad(String localidad);

    @Query("select p from Pabellon p where p.nombre = ?1")
    List<Pabellon> buscarPabellonPorNombre (String nombre);
}
