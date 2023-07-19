package org.owndeveloper.universidadproyect.services.implementaciones;


import org.owndeveloper.universidadproyect.models.Aula;
import org.owndeveloper.universidadproyect.models.Persona;
import org.owndeveloper.universidadproyect.models.enums.Pizarron;
import org.owndeveloper.universidadproyect.repositories.PersonaRepository;
import org.owndeveloper.universidadproyect.services.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoDAOImpl extends PersonaDAOImpl
        implements AlumnoDAO {

    @Autowired
    public AlumnoDAOImpl(@Qualifier("alumnoRepository") PersonaRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre) {
        return repository.buscarPersonaPorApellido(nombre);
    }



    /*@Override
    public Iterable<Aula> findAulasByPizarron(Pizarron pizarron) {
        return null;
    }

    @Override
    public Iterable<Aula> findAulasByPabellonNombre(String nombre) {
        return null;
    }

    @Override
    public Optional<Aula> findAulasByNroAula(Integer nroAula) {
        return Optional.empty();
    }*/
}