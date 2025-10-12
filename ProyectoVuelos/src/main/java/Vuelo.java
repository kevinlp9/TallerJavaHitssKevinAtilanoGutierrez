import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private LocalDate fechaLlegada;
    private LocalTime horaLlegada;
    private int cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino, LocalDate fechaLlegada, LocalTime horaLlegada, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString() {
        return String.format("%s: %s → %s, llega el %s %s, %d pasajeros",
                nombre, origen, destino,
                fechaLlegada, horaLlegada, cantidadPasajeros);
    }
}
