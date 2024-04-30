package co.edu.uniquindio.parcial2.parcial2.builders;

import co.edu.uniquindio.parcial2.parcial2.model.Objeto;
import co.edu.uniquindio.parcial2.parcial2.model.Prestamo;

public class ObjetoBuilder {

    protected String nombreObjeto;
    protected Prestamo prestamoAsociado;
    protected String codigoObjeto;

    public ObjetoBuilder nombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
        return this;
    }

    public ObjetoBuilder prestamoAsociado(Prestamo prestamoAsociado) {
        this.prestamoAsociado = prestamoAsociado;
        return this;
    }

    public ObjetoBuilder codigoObjeto(String codigoObjeto) {
        this.codigoObjeto = codigoObjeto;
        return this;
    }

    public Objeto build() {
        return new Objeto(nombreObjeto, prestamoAsociado, codigoObjeto);
    }
}
