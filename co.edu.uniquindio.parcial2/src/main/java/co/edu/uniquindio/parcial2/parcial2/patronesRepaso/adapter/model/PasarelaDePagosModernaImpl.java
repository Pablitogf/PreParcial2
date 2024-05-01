package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.model;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.services.IPasarelaDePagosModerna;

public class PasarelaDePagosModernaImpl implements IPasarelaDePagosModerna {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con la pasarela de pagos moderna: $" + monto);
    }
}
