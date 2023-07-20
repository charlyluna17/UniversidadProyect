package org.owndeveloper.universidadproyect.services.implementaciones;

import org.owndeveloper.universidadproyect.models.Persona;
import org.owndeveloper.universidadproyect.models.Profesor;
import org.owndeveloper.universidadproyect.repositories.PersonaRepository;
import org.owndeveloper.universidadproyect.repositories.ProfesorRepository;
import org.owndeveloper.universidadproyect.services.contratos.ProfesorDao;
import org.springframework.stereotype.Service;

@Service
public class ProfesorDAOImpl extends PersonaDAOImpl implements ProfesorDao {

private ProfesorRepository repository;

    public ProfesorDAOImpl(PersonaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Persona> findProfesorByCarrera(String carrera) {
        return repository.findProfesorByCarrera(carrera);
    }
}
