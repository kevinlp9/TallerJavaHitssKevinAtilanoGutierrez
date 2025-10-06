package Enums;

public enum PaymentMethod {
    CASH("Efectivo"),
    CARD("Tarjeta de credito/debito"),
    TRANSFER("Transferencia");

    public final String paymentMethod;

    PaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public String getDescription(){
        return paymentMethod;
    }

}
