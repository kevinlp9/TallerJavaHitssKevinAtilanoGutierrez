package Classes;

public class Camion extends Vehiculos{

    public Camion(String marca, String modelo, int km) {
        super(marca, modelo, km);
    }

    @Override
    public double calcularMantenimiento() {
        return 1500+ km*.30;
    }
}
