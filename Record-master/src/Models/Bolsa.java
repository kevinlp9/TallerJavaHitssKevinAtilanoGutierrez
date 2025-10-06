package Models;

import record.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bolsa<T extends Product> {
    private final List<T> list = new ArrayList<>();
    private final int capacity;

    public Bolsa(int capacity) {
        this.capacity = capacity;
    }

    public void add(T product){
        if(list.size() < capacity){
            list.add(product);
        }
    }

    public List<T> getItems(){
        return Collections.unmodifiableList(list);
    }

}
