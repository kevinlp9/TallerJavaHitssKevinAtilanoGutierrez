package impl.clases;

import impl.Electronico;

public class IPhone extends Electronico {

    private String modelo;
    private String color;

    public IPhone(int Precio, String fabricante, String color, String modelo) {
        super(Precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio(); // devuelve el precio base
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "color='" + modelo + '\'' +
                ", modelo='" + color + '\'' +
                '}';
    }
}