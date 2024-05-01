package co.edu.uniquindio.parcial2.parcial2.patronesParcial.prototype.model;

import co.edu.uniquindio.parcial2.parcial2.patronesParcial.prototype.services.GraphPrototype;

public class LineChart implements GraphPrototype {
    private String tipo2;

    public LineChart(){
        tipo2 = "LineChart";
    }

    @Override
    public GraphPrototype clonar() {
        LineChart lineChart = null;
        try {
            lineChart = (LineChart) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return lineChart;
    }
}
