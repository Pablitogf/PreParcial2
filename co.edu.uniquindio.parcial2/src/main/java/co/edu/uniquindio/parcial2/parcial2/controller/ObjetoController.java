package co.edu.uniquindio.parcial2.parcial2.controller;


import co.edu.uniquindio.parcial2.parcial2.factory.ModelFactory;
import co.edu.uniquindio.parcial2.parcial2.model.Objeto;

import java.util.List;

public class ObjetoController {

    ModelFactory modelFactory;

    public ObjetoController() {
        modelFactory = ModelFactory.getInstance();
    }

    public List<Objeto> obtenerObjetos() {
        return modelFactory.ObjetosMasPrestados();
    }
}