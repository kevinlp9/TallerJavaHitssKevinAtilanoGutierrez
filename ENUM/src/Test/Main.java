package Test;

import Models.Order;
import Enums.OrderStatus;
import Enums.OrderPriority;
import Enums.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Ana", OrderStatus.NEW, OrderPriority.HIGH, PaymentMethod.CARD);
        Order order2 = new Order("Luis", OrderStatus.SHIPPED, OrderPriority.MEDIUM, PaymentMethod.CASH);
        Order order3 = new Order("Maria", OrderStatus.DELIVERED, OrderPriority.LOW, PaymentMethod.TRANSFER);

        order1.showDetails();
        order2.showDetails();
        order3.showDetails();
    }
}
