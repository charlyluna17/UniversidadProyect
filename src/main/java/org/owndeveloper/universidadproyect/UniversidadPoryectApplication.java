package org.owndeveloper.universidadproyect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversidadPoryectApplication {

    public static void main(String[] args) {
        String[] beanDefinitionsNames = SpringApplication.run(UniversidadPoryectApplication.class, args).getBeanDefinitionNames();
        for (String str: beanDefinitionsNames){
            System.out.println(str);
        }
    }

}
