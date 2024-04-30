package co.edu.uniquindio.parcial2.parcial2.controller;

import co.edu.uniquindio.parcial2.parcial2.factory.ModelFactory;
import co.edu.uniquindio.parcial2.parcial2.model.Objeto;

import java.util.List;

public class ObjetoController {

    ModelFactory modelFactory;

    public ObjetoController() {
        modelFactory = ModelFactory.getInstancia();
    }

    public List<Objeto> obtenerObjetos() {
        return modelFactory.obtenerObjetos();
    }

    public List<Objeto> obtenerObjetosRango(int rango){
        return modelFactory.listaObjetos(0);
    }
}
