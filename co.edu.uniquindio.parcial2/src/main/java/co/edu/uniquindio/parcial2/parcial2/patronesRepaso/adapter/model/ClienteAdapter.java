package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.model;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.services.ISistemaDePagoHeredado;

public class ClienteAdapter {
    private ISistemaDePagoHeredado IsistemaDePagoHeredado;

    public ClienteAdapter(ISistemaDePagoHeredado sistemaDePagoHeredado) {
        this.IsistemaDePagoHeredado = sistemaDePagoHeredado;
    }

    public void realizarCompra(double monto) {
        IsistemaDePagoHeredado.realizarPago(monto);
    }
}