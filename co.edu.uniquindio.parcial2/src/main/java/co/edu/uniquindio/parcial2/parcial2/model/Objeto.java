package co.edu.uniquindio.parcial2.parcial2.model;

import co.edu.uniquindio.parcial2.parcial2.builders.ObjetoBuilder;

public class Objeto {

    private String nombreObjeto;
    private Prestamo prestamoAsociado;

    public Objeto() {
    }

    public Objeto(String nombreObjeto, Prestamo prestamoAsociado) {
        this.nombreObjeto = nombreObjeto;
        this.prestamoAsociado = prestamoAsociado;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public Prestamo getPrestamoAsociado() {
        return prestamoAsociado;
    }

    public static ObjetoBuilder builder(){
        return new ObjetoBuilder();
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombre='" + nombreObjeto + '\'' +
                ", prestamoAsociado=" + prestamoAsociado +
                '}';
    }
}
