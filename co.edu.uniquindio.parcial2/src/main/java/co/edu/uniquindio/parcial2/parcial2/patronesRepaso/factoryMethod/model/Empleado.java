package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.factoryMethod.model;

public abstract class Empleado {

    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract String obtenerTipo();
    public abstract double calcularPago();
}
