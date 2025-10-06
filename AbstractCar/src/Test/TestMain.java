package Test;

 import Classes.Bus;
 import Classes.Camion;
 import Classes.Car;
 import Classes.Vehiculos;

public class TestMain {
  public static void main(String[] args) {
      Vehiculos coche = new Car("Ford", "Focus", 10000);
      Vehiculos camion = new Camion("Chevrolet", "Camaro", 15000);
      Vehiculos bus = new Bus("Volvo", "V40", 100000);

      System.out.println(coche.calcularMantenimiento());
      System.out.println(camion.calcularMantenimiento());
      System.out.println(bus.calcularMantenimiento());
  }
}
