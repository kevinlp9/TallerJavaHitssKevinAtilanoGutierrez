package test;

import Models.Client;
import Models.Product;
import Repo.Repositorio;

import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        Repositorio<Client> clientRepositorio = new Repositorio<>();
        clientRepositorio.add(new Client("Susana"));
        clientRepositorio.add(new Client("Juan"));
        clientRepositorio.add(new Client("Pedro"));
        clientRepositorio.add(new Client("Maria"));

        List<Client> clients = clientRepositorio.getAll();
        for (Client client : clients) {
            System.out.println(client);
        }

        Repositorio<Product> productRepositorio = new Repositorio<>();
        productRepositorio.add(new Product("Pizza"));
        productRepositorio.add(new Product("Coca Cola"));
        productRepositorio.add(new Product("Cerveza"));
        productRepositorio.add(new Product("Bebida"));

        List<Product> products = productRepositorio.getAll();
        for (Product product : products) {
            System.out.println(product);
        }

    }
}
