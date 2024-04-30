package co.edu.uniquindio.parcial2.parcial2.model;

import co.edu.uniquindio.parcial2.parcial2.builders.ObjetoBuilder;
import co.edu.uniquindio.parcial2.parcial2.builders.PersonaBuilder;

public class Objeto {

    private String nombreObjeto;
    private Prestamo prestamoAsociado;
    private String codigoObjeto;

    public Objeto() {
    }

    public Objeto(String nombreObjeto, Prestamo prestamoAsociado, String codigoObjeto) {
        this.nombreObjeto = nombreObjeto;
        this.prestamoAsociado = prestamoAsociado;
        this.codigoObjeto = codigoObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public Prestamo getPrestamoAsociado() {
        return prestamoAsociado;
    }

    public String getCodigoObjeto() {
        return codigoObjeto;
    }

    public static ObjetoBuilder builder(){
        return new ObjetoBuilder();
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombreObjeto='" + nombreObjeto + '\'' +
                ", prestamoAsociado=" + prestamoAsociado +
                ", codigoObjeto='" + codigoObjeto + '\'' +
                '}';
    }
}
