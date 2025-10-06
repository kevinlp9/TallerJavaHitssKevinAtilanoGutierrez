package Conjuntos;

import Modelos.Alumno;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConjuntoHashsSet {
    public static void main(String[] args) {
        Set<String> departamentos = new HashSet<>();
        departamentos.add("A");
        departamentos.add("B");
        departamentos.add("C");
        departamentos.add("D");
        departamentos.add("C");
        System.out.println("Conjunto" + departamentos);

        Iterator<String> iterator = departamentos.iterator();
        while (iterator.hasNext()){
            String d = iterator.next();
            System.out.println("Departamento: " + d);
            if (d.equals("TI")){
                iterator.remove();
            }
        }
        System.out.println("Departamentos: " + departamentos);

        System.out.println("============================================");
        Set<Alumno> alumnos = new HashSet<>();
        alumnos.add(new Alumno(1, "Kevin", 8));
        alumnos.add(new Alumno(2, "Ann", 10));
        alumnos.add(new Alumno(3, "Juan", 9));
        alumnos.add(new Alumno(4, "Juan", 9));
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }
    }



}
