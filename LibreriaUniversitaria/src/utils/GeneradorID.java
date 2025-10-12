package utils;

import java.util.UUID;

public class GeneradorID {
    public static String generar() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
