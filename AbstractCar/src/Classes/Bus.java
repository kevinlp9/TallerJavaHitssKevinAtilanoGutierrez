package Classes;

public class Bus extends Vehiculos{

    public Bus(String marca, String modelo, int km) {
        super(marca, modelo, km);
    }

    @Override
    public double calcularMantenimiento() {
        return 1000+ km*.20;
    }
}
