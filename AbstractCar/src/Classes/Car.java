package Classes;

public class Car extends Vehiculos{

    public Car(String marca, String modelo, int km) {
        super(marca, modelo, km);
    }

    @Override
    public double calcularMantenimiento() {
        return 500+ km*.10;
    }

}
