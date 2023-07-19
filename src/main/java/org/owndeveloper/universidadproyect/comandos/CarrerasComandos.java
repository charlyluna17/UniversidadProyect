package org.owndeveloper.universidadproyect.comandos;

import org.owndeveloper.universidadproyect.models.Carrera;
import org.owndeveloper.universidadproyect.services.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
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

        /// esta es la prueba carrera
       /* Carrera carrera = null;
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

        }*/

        //creamos las asignaturas
        /*Carrera ingSistemas = new Carrera(null, "Ingenieria en Sistemas", 60, 5);
        Carrera ingIndustrial = new Carrera(null, "Ingenieria Industrial", 55, 5);
        Carrera ingAlimentos = new Carrera(null, "Ingenieria en Alimentos", 53, 5);
        Carrera ingElectronica = new Carrera(null, "Ingenieria Electronica", 45, 5);
        Carrera licSistemas = new Carrera(null, "Licenciatura en Sistemas", 40, 4);
        Carrera licTurismo = new Carrera(null, "Licenciatura en Turismo", 42, 4);
        Carrera licYoga = new Carrera(null, "Licenciatura en Yoga", 25, 3);
        Carrera licRecursos = new Carrera(null, "Licenciatura en Recursos Humanos - RRHH", 33, 3);

        //guardamos las asignaturas en Carrera
        servicio.save(ingSistemas);
        servicio.save(ingIndustrial);
        servicio.save(ingAlimentos);
        servicio.save(ingElectronica);
        servicio.save(licSistemas);
        servicio.save(licTurismo);
        servicio.save(licYoga);
        servicio.save(licRecursos);*/

        /*List<Carrera> carreras = (List<Carrera>) servicio.findCarrerasByNombreContains("Si");
        carreras.forEach(System.out::println);*/

       /* List<Carrera> carrerasIgnoreCase1 = (List<Carrera>)
                servicio.findCarrerasByNombreContainsIgnoreCase("SISTEMAS");
        List<Carrera> carrerasIgnoreCase2 = (List<Carrera>)
                servicio.findCarrerasByNombreContainsIgnoreCase("sistemas");
        carrerasIgnoreCase1.forEach(System.out::println);
        carrerasIgnoreCase2.forEach(System.out::println);

        List<Carrera> carrerasPorAnio = (List<Carrera>)
                servicio.findCarrerasByCantidadAniosAfter(3);
        carrerasPorAnio.forEach(System.out::println);*/
   }
}
