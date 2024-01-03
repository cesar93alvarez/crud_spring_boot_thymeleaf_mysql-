package com.app.we;

import com.app.we.entidad.Estudiante;
import com.app.we.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringBootApplication.class, args);
    }

    @Autowired
    private EstudianteRepositorio repositorio;

    @Override
    public void run(String... args) throws Exception {
        /*   Estudiante estudiante1 = new Estudiante("cesar","alvarez","cris20@gmail.com");

        Estudiante estudiante2 = new Estudiante("Maria", "Lopez", "maria@gmail.com");
        Estudiante estudiante3 = new Estudiante("Carlos", "Gonzalez", "carlos@gmail.com");

        repositorio.save(estudiante1);
        repositorio.save(estudiante2);
        repositorio.save(estudiante3);*/
    }
}
