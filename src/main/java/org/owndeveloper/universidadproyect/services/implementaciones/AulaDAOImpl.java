package org.owndeveloper.universidadproyect.services.implementaciones;

import org.owndeveloper.universidadproyect.models.Aula;
import org.owndeveloper.universidadproyect.models.enums.Pizarron;
import org.owndeveloper.universidadproyect.repositories.AulaRepository;
import org.owndeveloper.universidadproyect.services.contratos.AlumnoDAO;
import org.owndeveloper.universidadproyect.services.contratos.AulaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO {


    public AulaDAOImpl(AulaRepository repository) {
        super(repository);
    }

    @Override
    @Transactional
    public List<Aula> buscarAulaPorPizarron(Pizarron tipoPizarron) {
        return repository.buscarAulaPorPizarron(tipoPizarron);
    }

    @Override
    public List<Aula> buscarAulaPorNombrePabellon(String nombrePabellon) {
        return repository.buscarAulaPorNombrePabellon(nombrePabellon);
    }

    @Override
    public List<Aula> buscarAulaPorNumero(String numeroAula) {
        return repository.buscarAulaPorNumero(numeroAula);
    }
}
