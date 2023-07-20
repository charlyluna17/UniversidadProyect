package org.owndeveloper.universidadproyect.services.contratos;

import org.owndeveloper.universidadproyect.models.Aula;
import org.owndeveloper.universidadproyect.models.enums.Pizarron;

import java.util.List;

public interface AulaDAO extends GenericoDAO<Aula>{

    List<Aula> buscarAulaPorPizarron(Pizarron tipoPizarron);
    List<Aula> buscarAulaPorNombrePabellon(String nombrePabellon);
    List<Aula> buscarAulaPorNumero(String numeroAula);
}
