package org.owndeveloper.universidadproyect.services.implementaciones;

import org.owndeveloper.universidadproyect.models.Pabellon;
import org.owndeveloper.universidadproyect.repositories.PabellonRepository;
import org.owndeveloper.universidadproyect.services.contratos.PabellonDAO;

import java.util.List;

public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO {
    public PabellonDAOImpl(PabellonRepository repository) {
        super(repository);
    }


    @Override
    public List<Pabellon> buscarPabellonPorLocalidad(String localidad) {
        return repository.buscarPabellonPorLocalidad(localidad);
    }

    @Override
    public List<Pabellon> buscarPabellonPorNombre(String nombre) {
        return repository.buscarPabellonPorNombre(nombre);
    }
}
