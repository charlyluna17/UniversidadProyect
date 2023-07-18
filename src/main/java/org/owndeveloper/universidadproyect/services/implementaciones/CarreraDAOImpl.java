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
}