public class Jugador implements Comparable<Jugador> {
    private int id;
    private String nombre;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre.trim();
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jugador)) return false;
        Jugador j = (Jugador) o;
        return this.id == j.id; // igualdad por ID
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return id + " - " + nombre;
    }

    @Override
    public int compareTo(Jugador o) {
        int cmp = this.nombre.compareToIgnoreCase(o.nombre);
        if (cmp != 0) return cmp;
        return Integer.compare(this.id, o.id);
    }
}
