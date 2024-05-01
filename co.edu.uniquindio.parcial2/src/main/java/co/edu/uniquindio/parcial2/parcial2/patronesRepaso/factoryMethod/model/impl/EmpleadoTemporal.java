package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.factoryMethod.model.impl;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.factoryMethod.model.Empleado;

public class EmpleadoTemporal extends Empleado {

    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }


    @Override
    public String obtenerTipo() {
        return "Empleado Temporal";
    }

    @Override
    public double calcularPago() {
        return tarifaPorHora * horasTrabajadas;
    }
}
