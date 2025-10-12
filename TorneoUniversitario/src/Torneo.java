import java.util.*;

public class Torneo {
    private LinkedHashSet<Jugador> futbol = new LinkedHashSet<>();
    private LinkedHashSet<Jugador> basquet = new LinkedHashSet<>();
    private LinkedHashSet<Jugador> voleibol = new LinkedHashSet<>();
    private LinkedHashSet<Jugador> inscripcionGlobal = new LinkedHashSet<>();

    public boolean registrarJugador(String disciplina, Jugador j) {
        LinkedHashSet<Jugador> set = obtenerSetPorDisciplina(disciplina);
        if (set == null) return false;
        boolean agregado = set.add(j);
        if (!inscripcionGlobal.contains(j)) {
            inscripcionGlobal.add(j);
        }
        return agregado;
    }

    public boolean buscarJugadorEnDisciplina(String disciplina, int id) {
        LinkedHashSet<Jugador> set = obtenerSetPorDisciplina(disciplina);
        if (set == null) return false;
        return set.contains(new Jugador(id, "")); // equality por ID
    }

    public boolean eliminarJugador(String disciplina, int id) {
        LinkedHashSet<Jugador> set = obtenerSetPorDisciplina(disciplina);
        if (set == null) return false;
        boolean removed = set.remove(new Jugador(id, ""));
        return removed;
    }

    public Map<String, Integer> contarJugadoresPorDisciplina() {
        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("Fútbol", futbol.size());
        m.put("Básquetbol", basquet.size());
        m.put("Voleibol", voleibol.size());
        return m;
    }

    public Set<Jugador> fusionar(String d1, String d2) {
        LinkedHashSet<Jugador> s1 = obtenerSetPorDisciplina(d1);
        LinkedHashSet<Jugador> s2 = obtenerSetPorDisciplina(d2);
        if (s1 == null || s2 == null) return Collections.emptySet();
        HashSet<Jugador> union = new HashSet<>(s1);
        union.addAll(s2);
        return union;
    }

    public Set<Jugador> interseccion(String d1, String d2) {
        LinkedHashSet<Jugador> s1 = obtenerSetPorDisciplina(d1);
        LinkedHashSet<Jugador> s2 = obtenerSetPorDisciplina(d2);
        if (s1 == null || s2 == null) return Collections.emptySet();
        HashSet<Jugador> inter = new HashSet<>(s1);
        inter.retainAll(s2);
        return inter;
    }

    public boolean transferirJugador(int id, String desde, String hacia) {
        LinkedHashSet<Jugador> sDesde = obtenerSetPorDisciplina(desde);
        LinkedHashSet<Jugador> sHasta = obtenerSetPorDisciplina(hacia);
        if (sDesde == null || sHasta == null) return false;
        Jugador encontrado = null;
        for (Jugador j : sDesde) {
            if (j.getId() == id) {
                encontrado = j;
                break;
            }
        }
        if (encontrado == null) return false;
        boolean added = sHasta.add(encontrado);
        boolean removed = sDesde.remove(encontrado);
        return removed;
    }

    public Set<Jugador> obtenerTodosOrdenNombre() {
        TreeSet<Jugador> tree = new TreeSet<>();
        tree.addAll(futbol);
        tree.addAll(basquet);
        tree.addAll(voleibol);
        return tree;
    }

    public List<Jugador> obtenerTodosOrdenInscripcion() {
        return new ArrayList<>(inscripcionGlobal);
    }

    public Set<Jugador> obtenerRankingPorID() {
        TreeSet<Jugador> byId = new TreeSet<>(Comparator.comparingInt(Jugador::getId));
        byId.addAll(futbol);
        byId.addAll(basquet);
        byId.addAll(voleibol);
        return byId;
    }

    public Map<String, Map<String, Collection<Jugador>>> mostrarJugadoresPorDisciplinaConVistas() {
        Map<String, Map<String, Collection<Jugador>>> resultado = new LinkedHashMap<>();

        List<String> disciplinas = Arrays.asList("Fútbol", "Básquetbol", "Voleibol");
        for (String d : disciplinas) {
            LinkedHashSet<Jugador> base = obtenerSetPorDisciplina(d);
            Map<String, Collection<Jugador>> vistas = new LinkedHashMap<>();
            vistas.put("HashSet (sin orden)", new HashSet<>(base));
            vistas.put("LinkedHashSet (orden inscripción)", new LinkedHashSet<>(base));
            TreeSet<Jugador> tree = new TreeSet<>(base);
            vistas.put("TreeSet (orden alfabético)", tree);

            resultado.put(d, vistas);
        }
        return resultado;
    }

    private LinkedHashSet<Jugador> obtenerSetPorDisciplina(String disciplina) {
        switch (disciplina.toLowerCase()) {
            case "f":
            case "futbol":
            case "fútbol":
                return futbol;
            case "b":
            case "basquet":
            case "básquet":
            case "basquetbol":
            case "básquetbol":
                return basquet;
            case "v":
            case "voleibol":
                return voleibol;
            default:
                return null;
        }
    }

    // Métodos auxiliares para pruebas / info
    public void cargarDatosPrueba() {
        // Algunos jugadores (algunos repetidos en múltiples deportes)
        registrarJugador("futbol", new Jugador(101, "Ana López"));
        registrarJugador("futbol", new Jugador(102, "Carlos Pérez"));
        registrarJugador("futbol", new Jugador(103, "María Gómez"));

        registrarJugador("basquet", new Jugador(201, "Luis Martínez"));
        registrarJugador("basquet", new Jugador(102, "Carlos Pérez")); // inscrito también en fútbol
        registrarJugador("basquet", new Jugador(202, "Sofía Ruiz"));

        registrarJugador("voleibol", new Jugador(301, "Pedro Sánchez"));
        registrarJugador("voleibol", new Jugador(103, "María Gómez")); // inscrita también en fútbol
        registrarJugador("voleibol", new Jugador(302, "Valeria Díaz"));
    }

    public Collection<Jugador> obtenerJugadoresDisciplina(String disciplina) {
        LinkedHashSet<Jugador> s = obtenerSetPorDisciplina(disciplina);
        if (s == null) return Collections.emptyList();
        return new ArrayList<>(s);
    }

    public Jugador obtenerJugadorPorID(int id) {
        for (Jugador j : inscripcionGlobal) {
            if (j.getId() == id) return j;
        }
        for (Jugador j : futbol) if (j.getId() == id) return j;
        for (Jugador j : basquet) if (j.getId() == id) return j;
        for (Jugador j : voleibol) if (j.getId() == id) return j;
        return null;
    }
}
