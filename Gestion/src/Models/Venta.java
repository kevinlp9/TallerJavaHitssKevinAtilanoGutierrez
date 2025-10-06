package Models;

public class Venta {
    private int id;
    private String cliente;
    private double monto;

    public Venta(int id, String cliente, double monto) {
        this.id = id;
        this.cliente = cliente;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", monto=" + monto +
                '}';
    }
}
