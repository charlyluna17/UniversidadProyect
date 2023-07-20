package org.owndeveloper.universidadproyect.services.contratos;

import org.owndeveloper.universidadproyect.models.Pabellon;

import java.util.List;

public interface PabellonDAO extends GenericoDAO<Pabellon> {

    List<Pabellon> buscarPabellonPorLocalidad(String localidad);
    List<Pabellon> buscarPabellonPorNombre (String nombre);
}
