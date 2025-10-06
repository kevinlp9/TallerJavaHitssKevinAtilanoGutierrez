package TestMain;

import Classes.Felino;
import Classes.Caninos;
import Classes.Leon;
import Classes.Mamifero;
import Classes.Tigre;
import Classes.Lobo;

public class TestMain {
    public static void main(String[] args) {

        Mamifero[] mamifero = new Mamifero[6];

        mamifero[0] = new Leon("Sabana", 120.0f, 200.0f, 190.0f, "Panthera leo", 8.5, 80, 12, 110.0f);
        mamifero[1] = new Leon("Selva", 115.0f, 195.0f, 185.0f, "Panthera leo", 8.0, 75, 10, 105.0f);
        mamifero[2] = new Tigre("Selva", 130.0f, 250.0f, 220.0f, "Panthera tigris", 9.0, 85, "Bengala");
        mamifero[3] = new Tigre("Bosque", 125.0f, 245.0f, 210.0f, "Panthera tigris", 8.8, 82, "Siberiano");
        mamifero[4] = new Lobo("Bosque", 85.0f, 150.0f, 70.0f, "Canis lupus", "Gris", 7.5, 8, "Lobo");
        mamifero[5] = new Lobo("Tundra", 90.0f, 160.0f, 75.0f, "Canis lupus", "Blanco", 8.0, 10, "Lobo");

        for (Mamifero m : mamifero) {
            System.out.println("Datos del mamífero: " + m.toString());
            m.comer();
            m.dormir();
            m.comunicarse();
            m.correr();
            System.out.println();
        }
    }
}
