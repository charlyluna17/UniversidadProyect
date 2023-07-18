package org.owndeveloper.universidadproyect;

import org.owndeveloper.universidadproyect.models.Carrera;
import org.owndeveloper.universidadproyect.services.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

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

        Carrera carrera = null;
        Optional<Carrera> oCarrera = servicio.findById(1);
        if (oCarrera.isPresent()){
            carrera = oCarrera.get();
            System.out.println(carrera.toString());
        }else {
            System.out.println("carrera no existe");

            carrera.setCantidadMaterias(65);
            carrera.setCantidadAnios(6);
            servicio.save(carrera);
            System.out.println(servicio.findById(1).orElse(new Carrera()).toString());
            servicio.findById(1);
            System.out.println(servicio.findById(1).orElse(new Carrera()).toString());

        }
   }
}
