package co.edu.uniquindio.parcial2.parcial2.patronesParcial.prototype.model;

import co.edu.uniquindio.parcial2.parcial2.patronesParcial.prototype.services.GraphPrototype;

public class PieChart implements GraphPrototype {
    private String tipo3;

    public PieChart(){
        tipo3 = "PieChart";
    }

    @Override
    public GraphPrototype clonar() {
        PieChart pieChart = null;
        try {
            pieChart = (PieChart) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return pieChart;
    }
}
