package Genericos;

import java.util.ArrayList;
import java.util.List;

public class ServicioGenerico <T extends Identificable<ID>, ID>{
    private List<T> datos = new ArrayList<>();

    public T buscarPorId(ID id){
        for(T elemento : datos){
            if (elemento.getId().equals(id)){
                return elemento;
            }
        }
        return null;
    }

    public void guardar(T elemento){
        if(buscarPorId(elemento.getId()) != null){
            System.out.println("El elemento ya existe");
        }else {
            datos.add(elemento);
            System.out.println("Elemento guardado");
        }
    }

    public List<T> listar(){
        return datos;
    }

    public Boolean actualizar(ID id, T nuevoElemento){
        if (buscarPorId(id) != null){
            datos.set(datos.indexOf(buscarPorId(id)), nuevoElemento);
            System.out.println("Elemento actualizado");
            return true;
        }else{
            System.out.println("No se encontro el elemento");
            return false;
        }
    }

    public boolean eliminar(ID id) {
        if (buscarPorId(id) != null) {
            datos.remove(buscarPorId(id));
            System.out.println("Elemento eliminado");
            return true;
        } else {
            System.out.println("No se encontro el elemento");
            return false;
        }
    }

}
