package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.factoryMethod.model.impl;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.factoryMethod.model.Empleado;

public class EmpleadoPermanente extends Empleado {


    public EmpleadoPermanente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public String obtenerTipo() {
        return "Empleado Permanente";
    }

    @Override
    public double calcularPago() {
        return salario;
    }
}
