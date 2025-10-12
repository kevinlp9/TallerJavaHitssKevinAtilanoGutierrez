import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ProyectoVuelo {

    public static void main(String[] args) throws IOException {

        String rutaExcel = "src/main/resources/vuelos.xlsx";
        List<Vuelo> vuelos = new ArrayList<>();

        try (FileInputStream archivo = new FileInputStream(rutaExcel);
             Workbook libro = new XSSFWorkbook(archivo)) {

            Sheet hoja = libro.getSheetAt(0);
            Iterator<Row> filas = hoja.iterator();
            filas.next();

            while (filas.hasNext()) {
                Row fila = filas.next();

                String nombre = fila.getCell(0).getStringCellValue().trim();
                String origen = fila.getCell(1).getStringCellValue().trim();
                String destino = fila.getCell(2).getStringCellValue().trim();

                String fechaTexto = fila.getCell(3).getStringCellValue()
                        .replaceAll("([A-Za-z]{3})(\\d{1,2})", "$1 $2")
                        .trim();

                fechaTexto = fechaTexto
                        .replace("Lun", "")
                        .replace("Mar", "")
                        .replace("Mié", "")
                        .replace("Jue", "")
                        .replace("Vie", "")
                        .replace("Sáb", "")
                        .replace("Dom", "")
                        .trim();

                fechaTexto = fechaTexto
                        .replace("Ene", "Jan")
                        .replace("Feb", "Feb")
                        .replace("Mar", "Mar")
                        .replace("Abr", "Apr")
                        .replace("May", "May")
                        .replace("Jun", "Jun")
                        .replace("Jul", "Jul")
                        .replace("Ago", "Aug")
                        .replace("Sep", "Sep")
                        .replace("Oct", "Oct")
                        .replace("Nov", "Nov")
                        .replace("Dic", "Dec")
                        .trim();

                String horaTexto = fila.getCell(4).getStringCellValue()
                        .replace("hrs", "")
                        .trim();

                int pasajeros = (int) fila.getCell(5).getNumericCellValue();

                DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);
                LocalDate fecha = LocalDate.parse(fechaTexto, formatoFecha);

                DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
                LocalTime hora = LocalTime.parse(horaTexto, formatoHora);

                vuelos.add(new Vuelo(nombre, origen, destino, fecha, hora, pasajeros));
            }


        vuelos.sort(Comparator.comparing(Vuelo::getFechaLlegada)
                .thenComparing(Vuelo::getHoraLlegada));

        System.out.println("1. Listado de vuelos ordenado por fecha y hora de llegada ascendente:\n");
        vuelos.forEach(System.out::println);

        // 🔹 Último vuelo en llegar
        Vuelo ultimoVuelo = vuelos.get(vuelos.size() - 1);
        System.out.printf("\n2. El último vuelo en llegar es %s: %s, aterriza el %s %s%n",
                ultimoVuelo.getNombre(),
                ultimoVuelo.getOrigen(),
                ultimoVuelo.getFechaLlegada().getDayOfWeek(),
                ultimoVuelo.getHoraLlegada());

        Vuelo menorPasajeros = Collections.min(vuelos, Comparator.comparingInt(Vuelo::getCantidadPasajeros));
        System.out.printf("3. El vuelo con menor número de pasajeros es %s: %s, con %d pasajeros.%n",
                menorPasajeros.getNombre(),
                menorPasajeros.getOrigen(),
                menorPasajeros.getCantidadPasajeros());
    }
}}
