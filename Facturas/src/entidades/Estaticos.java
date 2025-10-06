package entidades;

import java.io.*;

public class Estaticos {
    public static void guardarFactura(Factura factura) {
        String directorio = "facturas";
        File dir = new File(directorio);
        if (!dir.exists()) {
            dir.mkdir();
        }

        String nombreArchivo = directorio + File.separator + "factura_" + factura.getId() + ".txt";

        try (FileWriter fw = new FileWriter(nombreArchivo);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(factura.generarTicket());
        } catch (IOException e) {
            System.out.println("Error al guardar la factura: " + e.getMessage());
        }
    }

    public static void leerFactura(Integer idFactura) {
        String archivo = "facturas" + File.separator + "factura_" + idFactura + ".txt";
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer la factura: " + e.getMessage());
        }
    }

    public static void listarFacturas() {
        File dir = new File("facturas");
        if (dir.exists() && dir.isDirectory()) {
            File[] archivos = dir.listFiles((d, name) -> name.startsWith("factura_") && name.endsWith(".txt"));
            if (archivos != null) {
                for (File archivo : archivos) {
                    System.out.println(archivo.getName());
                }
            }
        }
    }
    
    
}
