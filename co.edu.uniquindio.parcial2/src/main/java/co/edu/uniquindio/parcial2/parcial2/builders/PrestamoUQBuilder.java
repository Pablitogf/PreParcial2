package co.edu.uniquindio.parcial2.parcial2.builders;


import co.edu.uniquindio.parcial2.parcial2.model.*;

import java.util.List;

public class PrestamoUQBuilder {

    protected String nombrePrestamoUQ;

    public PrestamoUQBuilder nombrePrestamoUQ(String nombrePrestamoUQ){
        this.nombrePrestamoUQ = nombrePrestamoUQ;
        return this;
    }

    public PrestamoUQ build() {
        return new PrestamoUQ(nombrePrestamoUQ);
    }

}
