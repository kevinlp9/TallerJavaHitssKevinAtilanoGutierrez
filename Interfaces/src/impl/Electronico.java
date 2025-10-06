package impl;

public abstract class Electronico extends Producto implements IElectronico{

    private String fabricante;

    public Electronico(int Precio, String fabricante) {
        super(Precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

}
