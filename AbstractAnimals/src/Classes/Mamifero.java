package Classes;

public abstract class Mamifero {
    protected String habitat;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String NombreCientifico;

    public Mamifero(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        NombreCientifico = nombreCientifico;
    }

    public abstract void comer();
    public abstract void dormir();
    public abstract void comunicarse();
    public abstract void correr();

    public String getHabitat() {
        return habitat;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return NombreCientifico;
    }

    @Override
    public String toString() {
        return "{" +
                "habitat: '" + habitat + '\'' +
                ", altura: " + altura +
                ", largo: " + largo +
                ", peso: " + peso +
                ", NombreCientifico: '" + NombreCientifico + '\'' +
                '}';
    }
}
