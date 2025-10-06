package test;

import Clases.Estudiante;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        Path alumnosFile = Paths.get("estudiantes.txt");
        Path reportFile = Paths.get("reporte.txt");

        try{
            List<String> lines = Files.readAllLines(alumnosFile);
            List<Estudiante> estudiantes = new ArrayList<>();
            for (String linea : lines){
                String[] elemntos = linea.split(",");
                String nombre = elemntos[0].trim();
                int edad = Integer.parseInt(elemntos[1].trim());
                double calificacion = Double.parseDouble(elemntos[2].trim());
                estudiantes.add(new Estudiante(nombre, edad, calificacion));
            }
            int totalEstudiantes = estudiantes.size();
            int sumaEdades = 0;
            double sumaCalificaciones = 0;
            double maximaCalificacion = Double.MIN_VALUE;
            double minimaCalificacion = Double.MAX_VALUE;
            Estudiante peorEstudiante = null;
            Estudiante mejorEstudiante = null;

            for (Estudiante estudiante : estudiantes) {
                sumaEdades += estudiante.getEdad();
                sumaCalificaciones += estudiante.getCalificacion();
            }

        }catch(Exception e){

        }

    }
}
