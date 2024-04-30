package co.edu.uniquindio.parcial2.parcial2.patrones.adapter.model;

import co.edu.uniquindio.parcial2.parcial2.patrones.adapter.services.ISistemaDePagoHeredado;

public class ClienteAdapter {
    private ISistemaDePagoHeredado IsistemaDePagoHeredado;

    public ClienteAdapter(ISistemaDePagoHeredado sistemaDePagoHeredado) {
        this.IsistemaDePagoHeredado = sistemaDePagoHeredado;
    }

    public void realizarCompra(double monto) {
        IsistemaDePagoHeredado.realizarPago(monto);
    }
}