package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.model;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.services.ISistemaDePagoHeredado;

public class SistemaDePagoHeredadoImpl implements ISistemaDePagoHeredado {

    @Override
    public void realizarPago(double monto) {
        System.out.println("Realizando pago con el sistema heredado: $" + monto);
    }
}
