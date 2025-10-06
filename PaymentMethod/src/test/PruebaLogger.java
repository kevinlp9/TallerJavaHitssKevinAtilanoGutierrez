package test;

import impl.LoggerConsole;
import interfaz.logger;

import java.util.logging.Logger;

public class PruebaLogger {
    public static void main(String[] args) {
       logger logger1 = new LoggerConsole();
       logger1.info("Aplicacion iniciada");
       logger1.error("Error en la aplicacion");

    }
}
