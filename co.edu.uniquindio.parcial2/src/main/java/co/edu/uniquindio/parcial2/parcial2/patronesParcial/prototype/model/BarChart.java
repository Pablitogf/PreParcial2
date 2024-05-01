package co.edu.uniquindio.parcial2.parcial2.patronesParcial.prototype.model;

import co.edu.uniquindio.parcial2.parcial2.patronesParcial.prototype.services.GraphPrototype;

public class BarChart implements GraphPrototype {
    private String tipo1;

    public BarChart(){
        tipo1 = "BarChat";
    }

    @Override
    public GraphPrototype clonar() {
        BarChart barChart = null;
        try {
            barChart = (BarChart) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return barChart;
    }
}
