package co.edu.uniquindio.parcial2.parcial2.model;

import co.edu.uniquindio.parcial2.parcial2.builders.PrestamoBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestamo {

    private String numeroPrestamo;
    private Date fechaPrestamo;
    private Date fechaEntrega;
    private String descripcion;
    private Cliente clienteAsociado;
    private Empleado empleadoAsociado;
    private List<Objeto> listaObjetos;

    public Prestamo() {
    }

    public Prestamo(String numeroPrestamo, Date fechaPrestamo, Date fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado) {
        this.numeroPrestamo = numeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
        this.clienteAsociado = clienteAsociado;
        this.empleadoAsociado = empleadoAsociado;
        listaObjetos = new ArrayList<>();
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public static PrestamoBuilder builder(){
        return new PrestamoBuilder();
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "numeorPrestamo='" + numeroPrestamo + '\'' +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaEntrega=" + fechaEntrega +
                ", descripcion='" + descripcion + '\'' +
                ", clienteAsociado=" + clienteAsociado +
                ", empleadoAsociado=" + empleadoAsociado +
                ", listaObjetos=" + listaObjetos +
                '}';
    }
}
