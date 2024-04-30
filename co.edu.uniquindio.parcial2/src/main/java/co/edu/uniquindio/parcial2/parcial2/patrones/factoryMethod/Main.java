package co.edu.uniquindio.parcial2.parcial2.patrones.factoryMethod;

import co.edu.uniquindio.parcial2.parcial2.patrones.factoryMethod.model.Empleado;
import co.edu.uniquindio.parcial2.parcial2.patrones.factoryMethod.model.EmpleadoFabrica;

public class Main {

    public static void main(String[] args) {

        EmpleadoFabrica fabrica = new EmpleadoFabrica();
        Empleado empleado1 = fabrica.crearEmpleado("permanente", "Juan", 50000);
        Empleado empleado2 = fabrica.crearEmpleaodTemporal( "Maria", 20, 40);

        if (empleado1 != null){
            System.out.printf("Empleado 1:" + empleado1.obtenerTipo() + " Pago: " + empleado1.calcularPago()+ "\n" );
        }if (empleado2 != null){
            System.out.printf("Empleado 2: " + empleado2.obtenerTipo() + " Pago por hora: " + empleado2.calcularPago());
        }else{
            System.out.printf("No existe el empleado");
        }
    }
}
