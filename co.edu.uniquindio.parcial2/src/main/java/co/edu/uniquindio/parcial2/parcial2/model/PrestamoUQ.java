package co.edu.uniquindio.parcial2.parcial2.model;

import co.edu.uniquindio.parcial2.parcial2.builders.PrestamoUQBuilder;
import co.edu.uniquindio.parcial2.parcial2.controller.ClienteController;
import co.edu.uniquindio.parcial2.parcial2.factory.ModelFactory;

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

    public  List<Objeto> objetosPrestadosMayor(int rango){
        List<Objeto> listObjetoPrestadoRango = new ArrayList<>();

        for (Objeto objeto:listaObjetos){
            int contadoObjetoPrestado = 0;
            for (Prestamo prestamo: listaPrestamo){
                for (Objeto objetoPrestado:prestamo.getListaObjetos()){
                    if (objeto.getNombreObjeto().equals(objetoPrestado.getNombreObjeto())){
                        contadoObjetoPrestado++;
                    }
                }
            }
            if (contadoObjetoPrestado > rango){
                listObjetoPrestadoRango.add(objeto);
            }
        }
        return  listObjetoPrestadoRango;

    }
    ModelFactory modelFactory;

    public void ObjetoController() {
        modelFactory = ModelFactory.getInstancia();
    }

    public List<Objeto> obtenerObjetos() {
        return modelFactory.obtenerObjetos();
    }

    public List<Cliente> clientesPrestamos(int rango){
        List<Cliente> listaClientesPrestamos = new ArrayList<>();

        for(Cliente cliente: listaClientes){
            int contadorClientesPrestamos = 0;
            for (Prestamo prestamo: listaPrestamo){
                if (cliente.equals(prestamo.getClienteAsociado())){
                    contadorClientesPrestamos++;
                }
            }
            if (contadorClientesPrestamos > rango){
                listaClientesPrestamos.add(cliente);
            }
        }
        return listaClientesPrestamos;
    }
}
