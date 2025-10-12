import java.util.Comparator;
import java.util.List;

public class Empleado {
    private String id;
    private String nombre;
    private String departamento;
    private double salario;
    private int aniosExperiencia;
    private List<Evaluacion> evaluaciones;

    public Empleado(String id, String nombre, String departamento, double salario, int aniosExperiencia, List<Evaluacion> evaluaciones) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.aniosExperiencia = aniosExperiencia;
        this.evaluaciones = evaluaciones;
    }

    public String getNombre() { return nombre; }
    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }
    public int getAniosExperiencia() { return aniosExperiencia; }
    public List<Evaluacion> getEvaluaciones() { return evaluaciones; }

    public Evaluacion getUltimaEvaluacion() {
        return evaluaciones.stream()
                .max(Comparator.comparing(Evaluacion::getAnio))
                .orElse(null);
    }

    public double getPromedioEvaluaciones() {
        return evaluaciones.stream()
                .mapToInt(Evaluacion::getPuntaje)
                .average()
                .orElse(0);
    }

    @Override
    public String toString() {
        return nombre + " (" + departamento + ") - $" + salario;
    }
}
