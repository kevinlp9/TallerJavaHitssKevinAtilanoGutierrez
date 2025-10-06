package impl;

import interfaz.logger;

public class LoggerConsole implements logger {

    @Override
    public void log(String mensaje) {
        System.out.println(mensaje);
    }

}
