package Classes;

public abstract class Felino extends Mamifero{

    protected double garras;
    protected int velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, double garras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.garras = garras;
        this.velocidad = velocidad;
    }

    public double getGarras() {
        return garras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void comunicarse() {

    }

    @Override
    public void correr() {

    }
}
