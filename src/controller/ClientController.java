package controller;

import models.People.Client;

import java.util.ArrayList;

public class ClientController {
    private final ArrayList<Client> list = new ArrayList<>();

    public void cadastrarCliente(Client newClient){
        list.add(newClient);
        System.out.println("Cliente cadastrado com sucesso!");
    }
    public void listarClientes(){
        System.out.println("Lista de clientes cadastrados:");
        for (Client i : list) {
            System.out.println(i.getName());
        }
    }
}
