package org.owndeveloper.universidadproyect;

import org.owndeveloper.universidadproyect.models.Alumno;
import org.owndeveloper.universidadproyect.models.Direccion;
import org.owndeveloper.universidadproyect.models.Persona;
import org.owndeveloper.universidadproyect.services.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UniversidadPoryectApplication {

    @Autowired
    AlumnoDAO service;
    public static void main(String[] args) {
        SpringApplication.run
                        (UniversidadPoryectApplication.class, args)
                .getBeanDefinitionNames();
//        int num=0;
//        for (String str : beanDefinitionNames) {
//            num++;
//            System.out.println("beans "+num+" "+str);
//        }
    }
    @Bean
    public CommandLineRunner runner(){
        return args -> {
//            Direccion direccion = new Direccion("calle circunvalacion","123"
//                    ,"1263","","","San Sebastian");
//
//            Persona alumno = new Alumno(null,"Frank","Lopez","01234567",direccion);
//            Persona persona = service.save(alumno);
//            System.out.println(persona.toString());
//            List<Persona> alumnos =(List<Persona>) service.findAll();
//            alumnos.forEach(System.out::println);


        };
    }

}