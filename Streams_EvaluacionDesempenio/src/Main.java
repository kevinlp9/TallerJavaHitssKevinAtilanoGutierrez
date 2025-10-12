import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("1", "Ana", "IT", 60000, 6, Arrays.asList(new Evaluacion(2022, 85), new Evaluacion(2023, 92))),
                new Empleado("2", "Luis", "HR", 45000, 4, Arrays.asList(new Evaluacion(2023, 75))),
                new Empleado("3", "Carlos", "IT", 70000, 8, Arrays.asList(new Evaluacion(2021, 88), new Evaluacion(2023, 95))),
                new Empleado("4", "Marta", "Finance", 50000, 7, Arrays.asList(new Evaluacion(2023, 80))),
                new Empleado("5", "Sofía", "IT", 55000, 3, Arrays.asList(new Evaluacion(2023, 78)))
        );

        System.out.println("1. Empleados de IT:");
        empleados.stream()
                .filter(e -> e.getDepartamento().equals("IT"))
                .sorted(Comparator.comparing(Empleado::getNombre))
                .forEach(System.out::println);

        System.out.println("\n2. Salario promedio por departamento:");
        empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getDepartamento, Collectors.averagingDouble(Empleado::getSalario)))
                .forEach((dep, avg) -> System.out.println(dep + ": $" + avg));

        System.out.println("\n3. Empleado con mayor salario:");
        empleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario))
                .ifPresent(System.out::println);

        System.out.println("\n4. Empleados con +5 años y salario > 50,000:");
        empleados.stream()
                .filter(e -> e.getAniosExperiencia() > 5 && e.getSalario() > 50000)
                .forEach(System.out::println);

        System.out.println("\n5. Top 3 últimos puntajes:");
        empleados.stream()
                .sorted(Comparator.comparing((Empleado e) -> e.getUltimaEvaluacion().getPuntaje()).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\n6. Empleados con evaluación > 90:");
        long count90 = empleados.stream()
                .filter(e -> e.getEvaluaciones().stream().anyMatch(ev -> ev.getPuntaje() > 90))
                .count();
        System.out.println(count90 + " empleados");

        System.out.println("\n7. Ranking de promedios de evaluación:");
        empleados.stream()
                .sorted(Comparator.comparingDouble(Empleado::getPromedioEvaluaciones).reversed())
                .forEach(e -> System.out.println(e.getNombre() + ": " + e.getPromedioEvaluaciones()));
    }
}
