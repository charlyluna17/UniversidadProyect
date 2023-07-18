package org.owndeveloper.universidadproyect.repositories;


import org.owndeveloper.universidadproyect.models.Carrera;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CarreraRepository extends CrudRepository<Carrera,Integer> {
}
