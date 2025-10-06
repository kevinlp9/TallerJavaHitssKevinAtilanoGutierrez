package impl;

import interfaz.PaymentMethod;

public class CreditCardPayment implements PaymentMethod{

    @Override
    public void pago(double cantidad){
        System.out.println("Pagando $" + cantidad + " con tarjeta de credito. ");
    }

}
