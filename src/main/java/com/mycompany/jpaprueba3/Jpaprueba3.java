package com.mycompany.jpaprueba3;

import com.mycompany.jpaprueba3.logica.Alumno;
import com.mycompany.jpaprueba3.logica.Carrera;
import com.mycompany.jpaprueba3.logica.Controladora;
import com.mycompany.jpaprueba3.logica.Materia;
import java.util.Date;
import java.util.LinkedList;

public class Jpaprueba3 {
    public static void main(String[] args) {
        
       Controladora control = new Controladora();
       
       LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
       
       Carrera carre = new Carrera(87, "tecnicatura nutricion", listaMaterias);
       control.crearCarrera(carre);
       
       Materia mate1 = new Materia(28, "programacion 1", "cuatrimestral", carre);
       Materia mate2 = new Materia(29, "arquitectura y sistemas operaticos", "cuatrimestral", carre);
       Materia mate3 = new Materia(30, "Organizacion Empresarial", "cuatrimestral", carre);
       
       control.crearMateria(mate1);
       control.crearMateria(mate2);
       control.crearMateria(mate3);
       
       
       listaMaterias.add(mate1);
       listaMaterias.add(mate2);
       listaMaterias.add(mate3);
       
       carre.setListaMaterias(listaMaterias);
       control.editarCarrera(carre);
       
       
       Alumno alu = new Alumno(77, "antonio", "barros", new Date(), carre);
       control.crearAlumno(alu);
        
        System.out.println("---------------------------");
        System.out.println("-------------Datos alumnos----------------");
        Alumno alum = control.traerAlumno(77);
        System.out.println("Alumno: "+ alum.getNombre()+alum.getApellido());
        System.out.println("Cursa la carre de: "+ alum.getCarre().getNombre());
        
    }
}
