package co.edu.uniquindio.parcial2.parcial2.patronesParcial.prototype;

import co.edu.uniquindio.parcial2.parcial2.patronesParcial.prototype.model.BarChart;
import co.edu.uniquindio.parcial2.parcial2.patronesParcial.prototype.model.LineChart;
import co.edu.uniquindio.parcial2.parcial2.patronesParcial.prototype.model.PieChart;

public class Main {

    public static void main(String[] args) {
        ejercicio();
    }

    public static void ejercicio(){
        BarChart barChart1 = new BarChart();
        LineChart lineChart1= new LineChart();
        PieChart pieChart1 = new PieChart();

        LineChart lineChartClonado = (LineChart) lineChart1.clonar();

        System.out.printf(String.valueOf(barChart1) + "\n" + (lineChart1) + "\n"  + (pieChart1) + "\n" + (lineChartClonado));

    }
}
