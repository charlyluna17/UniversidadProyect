package org.owndeveloper.universidadproyect.services.implementaciones;

import org.owndeveloper.universidadproyect.models.Persona;
import org.owndeveloper.universidadproyect.models.enums.TipoEmpleado;
import org.owndeveloper.universidadproyect.repositories.EmpleadoRepository;
import org.owndeveloper.universidadproyect.repositories.PersonaRepository;
import org.owndeveloper.universidadproyect.services.contratos.EmpleadoDAO;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoDAOImpl extends PersonaDAOImpl implements EmpleadoDAO {
private EmpleadoRepository repository;

    public EmpleadoDAOImpl(PersonaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado) {
        return repository.findEmpleadoByTipoEmpleado(tipoEmpleado);
    }
}
