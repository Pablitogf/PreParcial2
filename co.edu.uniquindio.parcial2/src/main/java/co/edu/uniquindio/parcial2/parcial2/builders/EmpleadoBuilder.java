package co.edu.uniquindio.parcial2.parcial2.builders;


import co.edu.uniquindio.parcial2.parcial2.model.Empleado;

public class EmpleadoBuilder extends PersonaBuilder<EmpleadoBuilder>{

    @Override
    public Empleado build() {
        return new Empleado(nombre, apellido, cedula, edad);
    }
}
