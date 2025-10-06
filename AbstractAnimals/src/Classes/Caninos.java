package Classes;

public abstract class Caninos extends Mamifero{
    protected String color;
    protected double colmillos;
    
    public Caninos(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, double colmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.colmillos = colmillos;
    }

    public String getColor() {
        return color;
    }

    public double getColmillos() {
        return colmillos;
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
