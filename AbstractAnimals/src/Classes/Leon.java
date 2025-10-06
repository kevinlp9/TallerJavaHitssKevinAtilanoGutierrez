package Classes;

public class Leon extends Felino{

    private int numManada;
    private float PotenciaRugido;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, double garras, int velocidad, int numManada, float PotenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, garras, velocidad);
        this.numManada = numManada;
        this.PotenciaRugido = PotenciaRugido;
    }

    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugido() {
        return PotenciaRugido;
    }

    @Override
    public void comer() {
        System.out.println( "El Leon esta comiendo tiene un peso de " + getPeso() + " kg y tiene " + getGarras() + " garras además mide " + getAltura() + " cm de altura");
    }

    @Override
    public void dormir() {
        System.out.println( "El Leon con nombre cientifico de " + getNombreCientifico() + " esta durmiendo con " + getNumManada() + " manadas");
    }

    @Override
    public void comunicarse() {
        System.out.println( "El Leon se esta comunicando y tiene " + getPotenciaRugido() + " decibeles de potencia en su rugido");
    }

    @Override
    public void correr() {
        System.out.println( "El Leon esta corriendo a " + getVelocidad() + " km/h");
    }
}
