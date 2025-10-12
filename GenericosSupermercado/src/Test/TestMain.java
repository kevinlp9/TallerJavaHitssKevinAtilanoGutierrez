package Test;
import Models.Limpieza;
import Models.Fruta;
import Models.Lacteo;
import Models.NoPerecible;

public class TestMain {
    public static void main(String[] args) {
        Fruta[] bolsaFrutas = {
                new Fruta("Manzana", 12.5, 0.3, "Roja"),
                new Fruta("Plátano", 10.0, 0.25, "Amarillo"),
                new Fruta("Mango", 18.0, 0.4, "Naranja"),
                new Fruta("Fresa", 8.0, 0.05, "Roja"),
                new Fruta("Pera", 11.5, 0.35, "Verde")
        };

        Lacteo[] bolsaLacteos = {
                new Lacteo("Leche", 25.0, 1, 8),
                new Lacteo("Yogur", 12.0, 0, 5),
                new Lacteo("Queso", 40.0, 0, 10),
                new Lacteo("Crema", 30.0, 0, 6),
                new Lacteo("Mantequilla", 28.0, 0, 7)
        };

        Limpieza[] bolsaLimpieza = {
                new Limpieza("Jabón", 15.0, "Sodio, perfume", 0.5),
                new Limpieza("Detergente", 28.0, "Fósforo, enzimas", 1.0),
                new Limpieza("Cloro", 20.0, "Hipoclorito", 1.5),
                new Limpieza("Desinfectante", 22.0, "Alcohol, aroma", 0.75),
                new Limpieza("Limpiavidrios", 18.0, "Amoniaco", 0.6)
        };

        NoPerecible[] bolsaNoPerecibles = {
                new NoPerecible("Atún", 18.0, 120, 250),
                new NoPerecible("Frijoles", 22.0, 300, 200),
                new NoPerecible("Arroz", 25.0, 500, 350),
                new NoPerecible("Maíz", 20.0, 400, 300),
                new NoPerecible("Sopa instantánea", 10.0, 80, 150)
        };

        System.out.println("=== Bolsa de Frutas ===");
        for (Fruta f : bolsaFrutas) {
            System.out.println("Nombre: " + f.getNombre() +
                    ", Precio: $" + f.getPrecio() +
                    ", Peso: " + f.getPeso() + " kg" +
                    ", Color: " + f.getColor());
        }

        System.out.println("\n=== Bolsa de Lácteos ===");
        for (Lacteo l : bolsaLacteos) {
            System.out.println("Nombre: " + l.getNombre() +
                    ", Precio: $" + l.getPrecio() +
                    ", Cantidad: " + l.getCantidad() +
                    ", Proteínas: " + l.getProteinas() + " g");
        }

        System.out.println("\n=== Bolsa de Limpieza ===");
        for (Limpieza li : bolsaLimpieza) {
            System.out.println("Nombre: " + li.getNombre() +
                    ", Precio: $" + li.getPrecio() +
                    ", Componentes: " + li.getComponentes() +
                    ", Litros: " + li.getLitros());
        }

        System.out.println("\n=== Bolsa de No Perecibles ===");
        for (NoPerecible np : bolsaNoPerecibles) {
            System.out.println("Nombre: " + np.getNombre() +
                    ", Precio: $" + np.getPrecio() +
                    ", Contenido: " + np.getContenido() + " g" +
                    ", Calorías: " + np.getCalorias());
        }
    }
}

