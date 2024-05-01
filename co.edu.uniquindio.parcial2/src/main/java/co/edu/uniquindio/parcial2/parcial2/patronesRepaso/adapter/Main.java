package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.model.AdaptadorPago;
import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.model.ClienteAdapter;
import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.model.PasarelaDePagosModernaImpl;
import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.model.SistemaDePagoHeredadoImpl;
import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.services.IPasarelaDePagosModerna;
import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.adapter.services.ISistemaDePagoHeredado;

public class Main {

    public static void main(String[] args) {
        ISistemaDePagoHeredado sistemaHeredado = new SistemaDePagoHeredadoImpl();

        IPasarelaDePagosModerna pasarelaModerna = new PasarelaDePagosModernaImpl();

        AdaptadorPago adaptador = new AdaptadorPago(pasarelaModerna);

        ClienteAdapter clienteAdapter = new ClienteAdapter(adaptador);

        clienteAdapter.realizarCompra(100.0);
    }
}