package classes;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;

    // Constructor
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion,
                    double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    // Getters
    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    // Setters
    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje) {
        if (porcentaje > 0) {
            this.remuneracion = this.remuneracion * (1 + porcentaje / 100.0);
            System.out.println("Remuneración aumentada en " + porcentaje + "%");
        } else {
            System.out.println("El porcentaje debe ser positivo");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nID Empleado: " + empleadoId +
                "\nRemuneración: $" + String.format("%.2f", remuneracion);
    }
}
