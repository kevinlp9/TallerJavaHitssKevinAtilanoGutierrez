package Classes;

public class Perro extends Caninos{

    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, double colmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, colmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public void comer() {
        System.out.println("El perro esta comiendo, este tiene un peso de " + getPeso() + " kg y tiene " + getColmillos() + " colmillos");
    }

    @Override
    public void dormir() {
        System.out.println("El perro esta durmiendo, este tiene una altura de " + getAltura() + "cm y un largo de " + getLargo() + "cm");
    }

    @Override
    public void comunicarse() {
        System.out.println("El perro de nombre cientifico de " + getNombreCientifico() + " se esta comunicando, tiene un color de " + getColor() +
                " y tiene " + getColmillos() + " colmillos");
    }

    @Override
    public void correr() {
        System.out.println("El perro esta corriendo en su habitat " + getHabitat() + " y tiene una fuerza de mordida de " + getFuerzaMordida() + "");
    }
}
