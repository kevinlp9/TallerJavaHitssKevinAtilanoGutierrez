package impl;

public abstract class Producto implements IProducto{

    private int Precio;

    public Producto(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public int getPrecio() {
        return Precio;
    }



}
