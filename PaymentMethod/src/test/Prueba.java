package test;

import impl.CreditCardPayment;
import impl.Paypal;
import interfaz.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

    public static void main(String[] args) {
        PaymentMethod pago1 = new CreditCardPayment();
        PaymentMethod pago2 = new Paypal();
        PaymentMethod pago3 = new Paypal();

        pago1.pago(100);
        pago2.pago(150.5);
        pago3.pago(230);

    }
}
