package Generics;

public class Utils {
    public static <T extends Comparable<T>> T maximo(T a, T b){
        return (a.compareTo(b)>=0) ? a:b;
    }
}
