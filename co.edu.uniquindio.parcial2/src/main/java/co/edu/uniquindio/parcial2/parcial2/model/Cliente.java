package co.edu.uniquindio.parcial2.parcial2.model;

import co.edu.uniquindio.parcial2.parcial2.builders.ClienteBuilder;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{

    private List<Prestamo> listaPrestamosAsociados;

    public Cliente(String nombre, String apellido, String cedula, String edad) {
        super(nombre, apellido, cedula, edad);
        listaPrestamosAsociados = new ArrayList<>();
    }

    public List<Prestamo> getListaPrestamosAsociados() {
        return listaPrestamosAsociados;
    }

    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }
}
