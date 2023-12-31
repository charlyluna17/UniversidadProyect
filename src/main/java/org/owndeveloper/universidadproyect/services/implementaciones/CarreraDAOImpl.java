package org.owndeveloper.universidadproyect.services.implementaciones;

import org.owndeveloper.universidadproyect.models.Carrera;
import org.owndeveloper.universidadproyect.repositories.CarreraRepository;
import org.owndeveloper.universidadproyect.services.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CarreraDAOImpl extends GenericoDAOImpl<Carrera,CarreraRepository> implements CarreraDAO {
    @Autowired
    public CarreraDAOImpl(CarreraRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Carrera> findCarrerasByNombreContains(String nombre) {
        return repository.findCarrerasByNombreContains(nombre);
    }

    @Override
    public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre) {
        return repository.findCarrerasByNombreContainsIgnoreCase(nombre);
    }

    @Override
    public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidad) {
        return repository.findCarrerasByCantidadAniosAfter(cantidad);
    }

    @Override
    public Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido) {
        return repository.buscarCarrerasPorProfesorNombreYApellido(nombre, apellido);
    }

}