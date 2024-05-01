package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.model;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.services.IPasarelaDePagosModerna;
import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.services.ISistemaDePagoHeredado;

public class AdaptadorPago implements ISistemaDePagoHeredado {
    private IPasarelaDePagosModerna IpasarelaDePagosModerna;

    public AdaptadorPago(IPasarelaDePagosModerna pasarelaDePagosModerna) {
        this.IpasarelaDePagosModerna = pasarelaDePagosModerna;
    }

    @Override
    public void realizarPago(double monto) {
        IpasarelaDePagosModerna.procesarPago(monto);
    }
}