package org.owndeveloper.universidadproyect;

import org.owndeveloper.universidadproyect.models.Carrera;
import org.owndeveloper.universidadproyect.services.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarrerasComandos implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
  public void run(String... args)throws Exception{
//        Carrera ingSistemas = new Carrera(null, "Ingenieria en Sistemas",
//                50 ,5);
//
//        Carrera save = servicio.save(ingSistemas);
//        System.out.println(save.toString());
   }
}
