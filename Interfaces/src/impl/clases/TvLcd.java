package impl.clases;

import impl.Electronico;

public class TvLcd extends Electronico {

    private int pulgada;

    public TvLcd(int Precio, String fabricante, int pulgada) {
        super(Precio, fabricante);
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio();
    }

    @Override
    public String toString() {
        return "TvLcd{" +
                "pulgadas=" + pulgada +
                '}';
    }
}
