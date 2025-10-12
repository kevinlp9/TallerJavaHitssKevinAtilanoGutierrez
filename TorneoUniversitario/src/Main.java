import java.util.*;

public class Main {
    private static Torneo torneo = new Torneo();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestión de Torneo Deportivo Universitario ===");
        torneo.cargarDatosPrueba();
        System.out.println("Se han cargado datos de prueba (varios jugadores y duplicados entre deportes).");

        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            System.out.print("Selecciona una opción: ");
            String opcion = sc.nextLine().trim();
            System.out.println();
            switch (opcion) {
                case "1":
                    opcionMostrarJugadoresPorDeporte();
                    break;
                case "2":
                    opcionContarJugadores();
                    break;
                case "3":
                    opcionFusionarEquipos();
                    break;
                case "4":
                    opcionVerJugadoresEnComun();
                    break;
                case "5":
                    opcionTransferirJugador();
                    break;
                case "6":
                    opcionMostrarTodosOrdenNombre();
                    break;
                case "7":
                    opcionMostrarTodosOrdenInscripcion();
                    break;
                case "8":
                    opcionMostrarRankingPorID();
                    break;
                case "9":
                    salir = true;
                    break;
                case "r":
                case "R":
                    opcionRegistrarJugador();
                    break;
                case "e":
                case "E":
                    opcionEliminarJugador();
                    break;
                case "b":
                case "B":
                    opcionBuscarJugador();
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
            System.out.println();
        }

        System.out.println("Saliendo. ¡Hasta luego!");
        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println(" 1. Mostrar jugadores por deporte");
        System.out.println(" 2. Contar jugadores en cada disciplina");
        System.out.println(" 3. Fusionar equipos (unión)");
        System.out.println(" 4. Ver jugadores en común (intersección)");
        System.out.println(" 5. Transferir un jugador de un deporte a otro");
        System.out.println(" 6. Mostrar todos los jugadores ordenados por nombre");
        System.out.println(" 7. Mostrar todos los jugadores en orden de inscripción");
        System.out.println(" 8. Mostrar ranking de jugadores por ID");
        System.out.println(" 9. Salir");
        System.out.println();
        System.out.println("Extras (rápido): R - Registrar jugador | E - Eliminar jugador | B - Buscar jugador");
    }

    private static void opcionRegistrarJugador() {
        System.out.println("Registrar jugador (R)");
        String disc = pedirDisciplina();
        System.out.print("ID del jugador (número entero): ");
        int id = leerEntero();
        System.out.print("Nombre del jugador: ");
        String nombre = sc.nextLine().trim();
        boolean added = torneo.registrarJugador(disc, new Jugador(id, nombre));
        if (added) {
            System.out.println("Jugador registrado en " + disc + ".");
        } else {
            System.out.println("El jugador ya estaba inscrito en esa disciplina (no se permite duplicado por disciplina).");
        }
    }

    private static void opcionEliminarJugador() {
        System.out.println("Eliminar jugador (E)");
        String disc = pedirDisciplina();
        System.out.print("ID del jugador a eliminar: ");
        int id = leerEntero();
        boolean ok = torneo.eliminarJugador(disc, id);
        if (ok) System.out.println("Jugador eliminado de " + disc + ".");
        else System.out.println("Jugador no encontrado en " + disc + ".");
    }

    private static void opcionBuscarJugador() {
        System.out.println("Buscar jugador (B)");
        String disc = pedirDisciplina();
        System.out.print("ID del jugador a buscar: ");
        int id = leerEntero();
        boolean ok = torneo.buscarJugadorEnDisciplina(disc, id);
        if (ok) System.out.println("El jugador con ID " + id + " está inscrito en " + disc + ".");
        else System.out.println("No está inscrito en " + disc + ".");
    }

    private static void opcionMostrarJugadoresPorDeporte() {
        System.out.println("Mostrar jugadores por deporte (vistas HashSet / LinkedHashSet / TreeSet):");
        Map<String, Map<String, Collection<Jugador>>> vistas = torneo.mostrarJugadoresPorDisciplinaConVistas();
        for (Map.Entry<String, Map<String, Collection<Jugador>>> entry : vistas.entrySet()) {
            System.out.println("---- " + entry.getKey() + " ----");
            for (Map.Entry<String, Collection<Jugador>> vista : entry.getValue().entrySet()) {
                System.out.println("  * " + vista.getKey() + ":");
                if (vista.getValue().isEmpty()) {
                    System.out.println("      (sin jugadores)");
                } else {
                    for (Jugador j : vista.getValue()) {
                        System.out.println("      " + j);
                    }
                }
            }
            System.out.println();
        }
    }

    private static void opcionContarJugadores() {
        System.out.println("Contar jugadores en cada disciplina:");
        Map<String, Integer> conteos = torneo.contarJugadoresPorDisciplina();
        for (Map.Entry<String, Integer> e : conteos.entrySet()) {
            System.out.println("  " + e.getKey() + ": " + e.getValue());
        }
    }

    private static void opcionFusionarEquipos() {
        System.out.println("Fusionar equipos (unión). Elige dos disciplinas para unir:");
        String d1 = pedirDisciplina("Primera disciplina (desde)");
        String d2 = pedirDisciplina("Segunda disciplina (con la que se une)");
        Set<Jugador> union = torneo.fusionar(d1, d2);
        System.out.println("Jugadores únicos en la unión de " + d1 + " y " + d2 + ":");
        if (union.isEmpty()) System.out.println("  (ninguno)");
        else for (Jugador j : union) System.out.println("  " + j);
    }

    private static void opcionVerJugadoresEnComun() {
        System.out.println("Intersección (jugadores en común). Elige dos disciplinas:");
        String d1 = pedirDisciplina("Primera disciplina");
        String d2 = pedirDisciplina("Segunda disciplina");
        Set<Jugador> inter = torneo.interseccion(d1, d2);
        System.out.println("Jugadores inscritos tanto en " + d1 + " como en " + d2 + ":");
        if (inter.isEmpty()) System.out.println("  (ninguno)");
        else for (Jugador j : inter) System.out.println("  " + j);
    }

    private static void opcionTransferirJugador() {
        System.out.println("Transferir jugador de una disciplina a otra:");
        System.out.print("ID del jugador a transferir: ");
        int id = leerEntero();
        String desde = pedirDisciplina("Disciplina origen (desde)");
        String hacia = pedirDisciplina("Disciplina destino (hacia)");
        boolean ok = torneo.transferirJugador(id, desde, hacia);
        if (ok) System.out.println("Transferencia realizada (el jugador fue eliminado del origen y agregado al destino).");
        else System.out.println("No se pudo transferir (tal vez no existe en la disciplina origen).");
    }

    private static void opcionMostrarTodosOrdenNombre() {
        System.out.println("Todos los jugadores ordenados por nombre (únicos):");
        Set<Jugador> orden = torneo.obtenerTodosOrdenNombre();
        if (orden.isEmpty()) System.out.println("  (ninguno)");
        else for (Jugador j : orden) System.out.println("  " + j);
    }

    private static void opcionMostrarTodosOrdenInscripcion() {
        System.out.println("Todos los jugadores en orden de inscripción (global, primera inscripción):");
        List<Jugador> lista = torneo.obtenerTodosOrdenInscripcion();
        if (lista.isEmpty()) System.out.println("  (ninguno)");
        else for (Jugador j : lista) System.out.println("  " + j);
    }

    private static void opcionMostrarRankingPorID() {
        System.out.println("Ranking de jugadores por ID (de menor a mayor):");
        Set<Jugador> ranking = torneo.obtenerRankingPorID();
        if (ranking.isEmpty()) System.out.println("  (ninguno)");
        else for (Jugador j : ranking) System.out.println("  " + j);
    }

    private static String pedirDisciplina() {
        return pedirDisciplina("Disciplina (F=fútbol, B=básquetbol, V=voleibol): ");
    }

    private static String pedirDisciplina(String prompt) {
        while (true) {
            System.out.print(prompt);
            String d = sc.nextLine().trim();
            if (d.equalsIgnoreCase("f") || d.equalsIgnoreCase("futbol") || d.equalsIgnoreCase("fútbol")) return "futbol";
            if (d.equalsIgnoreCase("b") || d.equalsIgnoreCase("basquet") || d.equalsIgnoreCase("basquetbol") || d.equalsIgnoreCase("básquet") || d.equalsIgnoreCase("básquetbol")) return "basquet";
            if (d.equalsIgnoreCase("v") || d.equalsIgnoreCase("voleibol")) return "voleibol";
            System.out.println("Disciplina no reconocida. Usa F, B o V.");
        }
    }

    private static int leerEntero() {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingresa un número entero: ");
            }
        }
    }
}

