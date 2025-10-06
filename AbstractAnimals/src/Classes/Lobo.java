package Classes;

public class Lobo extends Caninos{

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, double colmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, colmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public void comer() {
        System.out.println("La especie del lobo es " + getEspecieLobo() + " y su nombre ciertifico es" +  getNombreCientifico() + " y esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El lobo esta durmiendo junto a su camada" + getNumCamada() + "" +
                " este tiene un peso de " + getPeso() + " kg" + " y tiene " + getColmillos() + " colmillos");
    }

    @Override
    public void comunicarse() {
        System.out.println("El lobo se esta comunicando, este tiene una altura de " + getAltura() + "y un largo de " + getLargo() + "cm");
    }

    @Override
    public void correr() {
        System.out.println("El lobo esta corriendo en su habitat" + getHabitat() + "y es de color " + getColor() + "");
    }
}
