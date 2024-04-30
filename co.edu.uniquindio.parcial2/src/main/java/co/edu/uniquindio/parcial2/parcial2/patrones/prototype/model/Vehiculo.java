package co.edu.uniquindio.parcial2.parcial2.patrones.prototype.model;

import co.edu.uniquindio.parcial2.parcial2.patrones.prototype.services.IVehiculo;

public class Vehiculo implements IVehiculo {

    private String marca;
    private String placa;

    public Vehiculo(){
        marca = "Renault";
    }

    @Override
    public IVehiculo clonar() {
        Vehiculo automovil = null;
        try {
            automovil = (Vehiculo) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return automovil;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
