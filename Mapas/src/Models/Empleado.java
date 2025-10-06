package Models;

public class Empleado {
    private int id;
    private String name;
    private String departamento;

    public Empleado(int id, String name, String departamento) {
        this.id = id;
        this.name = name;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartamento(){
        return departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
