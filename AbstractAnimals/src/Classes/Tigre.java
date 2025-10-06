package Classes;

public class Tigre extends Felino{

    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, double garras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, garras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public void correr() {
        System.out.println( "El Tigre de especie " + getEspecieTigre() + "esta corriendo a " + getVelocidad() + " km/h");
    }

    @Override
    public void dormir() {
        System.out.println("El tigre de especie " + getEspecieTigre() + " con un peso de " + getPeso() + "" +
                " esta durmiendo y tiene un largo de " + getLargo() + " cm");
    }

    @Override
    public void comunicarse() {
        System.out.println( "El Tigre de especie " + getEspecieTigre() + " se esta comunicando" +" y tiene " + getGarras() + " garras"
        + " y tiene una velocidad de " + getVelocidad() + " km/h");
    }

    @Override
    public void comer() {
        System.out.println("El Tigre de especie " + getEspecieTigre() + " esta comiendo en su habitat" + getHabitat());
    }



}
