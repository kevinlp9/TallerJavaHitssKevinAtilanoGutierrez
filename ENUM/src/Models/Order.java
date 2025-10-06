package Models;

import Enums.OrderStatus;
import Enums.OrderPriority;
import Enums.PaymentMethod;

public class Order {
    private String customer;
    private OrderStatus status;
    private OrderPriority priority;
    private PaymentMethod paymentMethod;
    private static int contador;

    public Order(String customer, OrderStatus status,
                 OrderPriority priority, PaymentMethod paymentMethod) {
        this.customer = customer;
        this.status = status;
        this.priority = priority;
        this.paymentMethod = paymentMethod;
    }

    public void showDetails() {
        System.out.println("Pedido #" + ++contador);
        System.out.println("Cliente: " + customer);
        System.out.println("Estado: " + status + " → " + status.getMessage());
        System.out.println("Prioridad: " + priority + " (Nivel " + priority.getLevel() + ")");
        System.out.println("Método de pago: " + paymentMethod + " → " + paymentMethod.getDescription());
        System.out.println();
    }
}
