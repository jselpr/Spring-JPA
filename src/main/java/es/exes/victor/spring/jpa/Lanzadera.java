/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.exes.victor.spring.jpa;

import java.util.Date;
import modelo.Persona;
import modelo.dao.Dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author odeen
 */
public class Lanzadera {
    public static void main(String[] args) {
        ApplicationContext aplicacion = new ClassPathXmlApplicationContext("configuracion.xml");
        Dao dao = aplicacion.getBean("dao", Dao.class);
        Persona p = new Persona();
        p.setNombre("Jose");
        p.setFechaNacimiento(new Date());
        dao.insertar(p);
        System.out.println(dao.getTodas());
    }
}
