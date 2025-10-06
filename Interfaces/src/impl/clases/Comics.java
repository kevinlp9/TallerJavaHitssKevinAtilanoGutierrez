package impl.clases;

import impl.ILibro;
import impl.Libro;

import java.util.Date;

public class Comics extends Libro implements ILibro{

    private String personaje;

    public Comics(int Precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(Precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public String toString() {
        return "Comics{" +
                "personaje='" + personaje + '\'' +
                '}';
    }
}
