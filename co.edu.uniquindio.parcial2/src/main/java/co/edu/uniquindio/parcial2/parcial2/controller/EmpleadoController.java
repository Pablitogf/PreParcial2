package co.edu.uniquindio.parcial2.parcial2.controller;

import co.edu.uniquindio.parcial2.parcial2.factory.ModelFactory;
import co.edu.uniquindio.parcial2.parcial2.model.Empleado;

import java.util.List;

public class EmpleadoController {

    ModelFactory modelFactory;

    public EmpleadoController(){
        modelFactory = ModelFactory.getInstancia();
    }

    public List<Empleado> obtenerEmpleado() {
        return modelFactory.obtenerEmpleado();
    }

    public List<Empleado> obtenerPrestamosClientes(int rango){
        return modelFactory.listaEmpleados(rango);
    }
}
