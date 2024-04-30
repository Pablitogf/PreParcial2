package co.edu.uniquindio.parcial2.parcial2.controller;

import co.edu.uniquindio.parcial2.parcial2.factory.ModelFactory;
import co.edu.uniquindio.parcial2.parcial2.model.Cliente;

import java.util.List;

public class ClienteController {

    ModelFactory modelFactory;

    public ClienteController() {
        modelFactory = ModelFactory.getInstancia();
    }

    public List<Cliente> obtenerCliente() {
        return modelFactory.obtenerCliente();
    }

    public List<Cliente> obtenerPrestamosClientes(int rango){
        return modelFactory.listaClientes(rango);
    }
}
