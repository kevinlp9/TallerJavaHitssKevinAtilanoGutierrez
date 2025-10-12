package models;

public class Libro {
    private static final int MIN_ANIO = 1900;
    private String id;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private double precio;

    public Libro(String id, String titulo, String autor, int anioPublicacion, double precio) {
        if (anioPublicacion < MIN_ANIO) {
            throw new IllegalArgumentException("El año debe ser mayor a " + MIN_ANIO);
        }
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
    }

    public String resumen() {
        return titulo + " (" + anioPublicacion + ") - " + autor + " | $" + precio;
    }

    public String getId() { return id; }
    public double getPrecio() { return precio; }
    public String getTitulo() { return titulo; }
}
