package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.factoryMethod.model;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.factoryMethod.model.impl.EmpleadoPermanente;
import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.factoryMethod.model.impl.EmpleadoTemporal;

public class EmpleadoFabrica {

    public Empleado crearEmpleado (String tipo, String nombre, double salario) {
        if (tipo.equalsIgnoreCase("permanente")) {
            return new EmpleadoPermanente(nombre, salario);
        }if (tipo.equalsIgnoreCase("temporal")){
            return new EmpleadoTemporal(nombre, 0, 0);
        }else{
            return null;
        }
    }

    public Empleado crearEmpleaodTemporal(String nombre, int horasTrabajadas, double tarifaPorHora){
        return new EmpleadoTemporal(nombre,horasTrabajadas, tarifaPorHora);
    }

}
