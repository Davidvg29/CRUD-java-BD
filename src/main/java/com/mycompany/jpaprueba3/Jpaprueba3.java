package com.mycompany.jpaprueba3;

import com.mycompany.jpaprueba3.logica.Alumno;
import com.mycompany.jpaprueba3.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;

public class Jpaprueba3 {
    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        Alumno alu = control.traerAlumno(23);
        System.out.println("---------busqueda individual----------");
        System.out.println("el alumno es: " + alu.toString());
        
        System.out.println("----------busqueda de todos-----------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for (Alumno al : listaAlumnos) {
            System.out.println("el alumno es: "+al.toString());
        }
        
        
        
    }
}
