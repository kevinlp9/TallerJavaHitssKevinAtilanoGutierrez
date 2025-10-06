package Classes;

public class Guepardo extends Felino {

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, double garras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, garras, velocidad);
    }

    @Override
    public void comer() {
        System.out.println("El Guepardo esta comiendo y tiene un peso de " + getPeso() + " kg" + " y tiene " + getGarras() + " garras"
        + " ademas mide " + getAltura() + " cm de altura");
    }

    @Override
    public void dormir() {
        System.out.println("El guepardo tien un largo de " + getLargo() + " cm y esta durmiendo en su habitat " + getHabitat());
    }

    @Override
    public void comunicarse() {
        System.out.println("El guepardo con nombre cientifico de " + getNombreCientifico() + " se esta comunicando");
    }

    @Override
    public void correr() {
        System.out.println("El guepardo con nombre cientifico de " + getNombreCientifico() + " esta corriendo a " + getVelocidad() + " km/h");
    }
}
