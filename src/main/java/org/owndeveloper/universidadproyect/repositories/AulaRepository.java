package org.owndeveloper.universidadproyect.repositories;

import org.owndeveloper.universidadproyect.models.Aula;
import org.owndeveloper.universidadproyect.models.enums.Pizarron;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AulaRepository extends CrudRepository<Aula, Integer> {

    @Query("SELECT a FROM Aula a WHERE a.pizarron = ?1")
    List<Aula> buscarAulaPorPizarron(Pizarron tipoPizarron);

    @Query("select a from Aula a join fetch a.pabellon p where p.nombre = ?1")
    List<Aula> buscarAulaPorNombrePabellon(String nombrePabellon);

    @Query("select a from Aula a where a.nroAula = ?1")
    List<Aula> buscarAulaPorNumero(String numeroAula);
}
