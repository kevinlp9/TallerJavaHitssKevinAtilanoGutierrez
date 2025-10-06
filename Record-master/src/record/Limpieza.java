package record;

public class Limpieza extends Product{
    private String componentes;
    private double litros;

    public Limpieza(String name, double price, String componentes, double litros) {
        super(name, price);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }

}
