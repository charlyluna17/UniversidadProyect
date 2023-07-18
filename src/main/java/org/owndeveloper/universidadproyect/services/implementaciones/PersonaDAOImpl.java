package org.owndeveloper.universidadproyect.services.implementaciones;

import org.owndeveloper.universidadproyect.models.Persona;
import org.owndeveloper.universidadproyect.repositories.PersonaRepository;
import org.owndeveloper.universidadproyect.services.contratos.PersonaDAO;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class PersonaDAOImpl extends GenericoDAOImpl<Persona, PersonaRepository>
implements PersonaDAO {

    public PersonaDAOImpl(PersonaRepository repository){
        super(repository);
    }

    @Override
    public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido) {
        return repository.buscarPorNombreYApellido(nombre, apellido);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Persona> buscarPorDni(String dni) {
        return repository.buscarPorDni(dni);

    }

    @Override
    public Iterable<Persona> buscarPersonaPorApellido(String apellido) {
        return repository.buscarPersonaPorApellido(apellido);
    }
}
