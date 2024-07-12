package com.mycompany.jpaprueba3;

import com.mycompany.jpaprueba3.logica.Alumno;
import com.mycompany.jpaprueba3.logica.Carrera;
import com.mycompany.jpaprueba3.logica.Controladora;
import java.util.Date;

public class Jpaprueba3 {
    public static void main(String[] args) {
        
       Controladora control = new Controladora();
       
       Carrera carre = new Carrera(87, "tecnicatura nutricion");
       control.crearCarrera(carre);
       Alumno alu = new Alumno(77, "antonio", "barros", new Date(), carre);
       control.crearAlumno(alu);
        
        System.out.println("---------------------------");
        System.out.println("-------------Datos alumnos----------------");
        Alumno alum = control.traerAlumno(87);
        System.out.println("Alumno: "+ alum.getNombre()+alum.getApellido());
        System.out.println("Cursa la carre de: "+ alum.getCarre().getNombre());
        
    }
}
