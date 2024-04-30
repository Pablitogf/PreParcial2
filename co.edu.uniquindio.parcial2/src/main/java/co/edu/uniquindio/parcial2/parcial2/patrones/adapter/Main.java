package co.edu.uniquindio.parcial2.parcial2.patrones.adapter;

import co.edu.uniquindio.parcial2.parcial2.model.Cliente;
import co.edu.uniquindio.parcial2.parcial2.patrones.adapter.model.AdaptadorPago;
import co.edu.uniquindio.parcial2.parcial2.patrones.adapter.model.ClienteAdapter;
import co.edu.uniquindio.parcial2.parcial2.patrones.adapter.model.PasarelaDePagosModernaImpl;
import co.edu.uniquindio.parcial2.parcial2.patrones.adapter.model.SistemaDePagoHeredadoImpl;
import co.edu.uniquindio.parcial2.parcial2.patrones.adapter.services.IPasarelaDePagosModerna;
import co.edu.uniquindio.parcial2.parcial2.patrones.adapter.services.ISistemaDePagoHeredado;

public class Main {

    public static void main(String[] args) {
        ISistemaDePagoHeredado sistemaHeredado = new SistemaDePagoHeredadoImpl();

        IPasarelaDePagosModerna pasarelaModerna = new PasarelaDePagosModernaImpl();

        AdaptadorPago adaptador = new AdaptadorPago(pasarelaModerna);

        ClienteAdapter clienteAdapter = new ClienteAdapter(adaptador);

        clienteAdapter.realizarCompra(100.0);
    }
}