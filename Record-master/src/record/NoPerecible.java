package record;

public class NoPerecible extends Product{
    private int contenido;
    private int calorias;

    public NoPerecible(String name, double price, int contenido, int calorias) {
        super(name, price);
        this.contenido = contenido;
        this.calorias = calorias;
    }
    public int getContenido() {
        return contenido;
    }
    public int getCalorias() {
        return calorias;
    }
}
