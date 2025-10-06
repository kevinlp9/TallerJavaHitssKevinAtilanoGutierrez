package impl;

import interfaz.PaymentMethod;

public class Paypal implements PaymentMethod {

    @Override
    public void pago(double cantidad){
        System.out.println("Pagando $" + cantidad + " con Paypal. ");
    }

}
