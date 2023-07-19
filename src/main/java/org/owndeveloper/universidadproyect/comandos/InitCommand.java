package org.owndeveloper.universidadproyect.comandos;

import org.owndeveloper.universidadproyect.services.contratos.CarreraDAO;
import org.owndeveloper.universidadproyect.services.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class InitCommand  {

    @Autowired
    @Qualifier(value = "alumnoDAOImpl")
    private PersonaDAO servicioAlumno;
   /* @Autowired
    @Qualifier(value = "empleadoDAOImpl")
    private PersonaDAO servicioEmpleado;
    @Autowired
    @Qualifier(value = "profesorDAOImpl")
    private PersonaDAO servicioProfesor;
    @Autowired
    private AulaDAO servicioAula;
    @Autowired
    private PabellonDAO servicioPabellon;
    @Autowired
    private CarreraDAO servicioCarrera;*/

}
