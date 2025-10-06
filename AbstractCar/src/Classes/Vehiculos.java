package Classes;

public abstract class Vehiculos {
    protected String marca;
    protected String modelo;
    protected int km;

    public Vehiculos(String marca, String modelo, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }

    public abstract double calcularMantenimiento();

    @Override
    public String toString() {
        return "{" +
                "marca: '" + marca + '\'' +
                ", modelo: '" + modelo + '\'' +
                ", km: " + km +
                '}';
    }
}
