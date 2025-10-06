package test;
import Models.Bolsa;
import record.*;

public class TestMain {
    public static void main(String[] args) {
        Bolsa<Fruta> bolsaFruta = new Bolsa<>(5);
        bolsaFruta.add(new Fruta("Manzana", 100, 10, "Verde"));
        bolsaFruta.add(new Fruta("Pera", 100, 10, "Morada"));
        bolsaFruta.add(new Fruta("Uva", 100, 10, "Roja"));
        bolsaFruta.add(new Fruta("Naranja", 100, 10, "Amarilla"));
        bolsaFruta.add(new Fruta("Fresa", 100, 10, "Morada"));

        Bolsa<Lacteo> bolsaLacteo = new Bolsa<>(5);
        bolsaLacteo.add(new Lacteo("Leche", 30, 5, 200));
        bolsaLacteo.add(new Lacteo("Yogurt", 30, 5, 200));
        bolsaLacteo.add(new Lacteo("Crema", 30, 5, 200));
        bolsaLacteo.add(new Lacteo("Mantequilla", 30, 5, 200));
        bolsaLacteo.add(new Lacteo("Yakult", 30, 5, 200));

        Bolsa<NoPerecible> bolsaNoPerecible = new Bolsa<>(5);
        bolsaNoPerecible.add(new NoPerecible("Arroz", 2.1, 1000, 3600));
        bolsaNoPerecible.add(new NoPerecible("Fideos", 1.4, 500, 1800));
        bolsaNoPerecible.add(new NoPerecible("Lentejas", 2.8, 500, 1600));
        bolsaNoPerecible.add(new NoPerecible("Garbanzos", 3.0, 500, 1500));
        bolsaNoPerecible.add(new NoPerecible("Azúcar", 1.9, 1000, 4000));

        Bolsa<Limpieza> bolsaLimpieza = new Bolsa<>(5);
        bolsaLimpieza.add(new Limpieza("Lavandina", 1.7, "Hipoclorito", 1.5));
        bolsaLimpieza.add(new Limpieza("Detergente", 1.3, "Tensioactivos", 0.75));
        bolsaLimpieza.add(new Limpieza("Jabón Líquido", 2.0, "Glicerina", 0.9));
        bolsaLimpieza.add(new Limpieza("Suavizante", 2.5, "Fragancias", 1.0));
        bolsaLimpieza.add(new Limpieza("Desinfectante", 2.2, "Amonios cuaternarios", 0.8));

        System.out.println("=== Bolsa Frutas ====");
        for (Fruta f : bolsaFruta.getItems()){
            System.out.println("Name: " + f.getName() + " | Price: " + f.getPrice() + " | Weight: " + f.getWeight() + " | Color: " + f.getColor() + "}");
        }

        System.out.println("=== Bolsa Lacteos ====");
        for (Lacteo l : bolsaLacteo.getItems()){
            System.out.println("Name: " + l.getName() + " | Price: " + l.getPrice() + " | Quantity: " + l.getQuantity() + " | Proteinas: " + l.getProteinas() + "}");
        }

        System.out.println("=== Bolsa No Perecibles ====");
        for (NoPerecible n : bolsaNoPerecible.getItems()){
            System.out.println("Name: " + n.getName() + " | Price: " + n.getPrice() + " | Content (gr/ml): " + n.getContenido() + " | Calorías: " + n.getCalorias() + "}");

        }

        System.out.println("=== Bolsa Limpieza ====");
        for (Limpieza li : bolsaLimpieza.getItems()){
            System.out.println("{Name: " + li.getName() + " | Price: " + li.getPrice() + " | Components: " + li.getComponentes() + " | Litros: " + li.getLitros() + "}");
        }



    }
}
