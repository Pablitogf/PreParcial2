package co.edu.uniquindio.parcial2.parcial2.model;

import co.edu.uniquindio.parcial2.parcial2.builders.PrestamoUQBuilder;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUQ {

    public boolean crearCliente;

    private String nombrePrestamoUQ;

    private List<Prestamo> listaPrestamo;

    private List<Empleado> listaEmpleados;

    private List<Objeto> listaObjetos;

    private List<Cliente> listaClientes;


    public PrestamoUQ() {
    }

    public PrestamoUQ(String nombrePrestamoUQ) {
        this.nombrePrestamoUQ = nombrePrestamoUQ;
        listaPrestamo = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
        listaObjetos = new ArrayList<>();
        listaClientes = new ArrayList<>();
    }

    public String getNombrePrestamoUQ() {
        return nombrePrestamoUQ;
    }

    public List<Prestamo> getListaPrestamo() {
        return listaPrestamo;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public static PrestamoUQBuilder builder(){
        return new PrestamoUQBuilder();
    }

    @Override
    public String toString() {
        return "PrestamoUQ{" +
                "nombrePrestamoUQ='" + nombrePrestamoUQ + '\'' +
                ", listaPrestamo=" + listaPrestamo +
                ", listaEmpleado=" + listaEmpleados +
                ", listaObjeto=" + listaObjetos +
                ", listaCliente=" + listaClientes    +
                '}';
    }
}
