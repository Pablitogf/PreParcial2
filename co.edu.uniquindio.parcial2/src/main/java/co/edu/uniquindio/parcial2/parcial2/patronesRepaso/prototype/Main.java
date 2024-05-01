package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.prototype;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.prototype.model.Vehiculo;

public class Main {

    public static void main(String[] args) {
        ejercicio();
    }

    private static void ejercicio() {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setPlaca("GFV 735");

        Vehiculo vehiculo2 = new Vehiculo();
        Vehiculo vehiculoClonado = (Vehiculo) vehiculo1.clonar();

        System.out.printf(String.valueOf(vehiculo1) + "\n");
        System.out.printf(String.valueOf(vehiculo2) + "\n");
        System.out.printf(String.valueOf(vehiculoClonado));

    }


}
