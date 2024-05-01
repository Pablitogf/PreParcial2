package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.command.model;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.command.services.Command;

public class ClienteCommand {

    public static void main(String[] args) {
        Receptor receptor = new Receptor();

        Command entregaLocal = new EntregaLocalCommand(receptor);
        Command entregaNacional = new EntregaNacionalCommand(receptor);
        Command entregaInternacional = new EntregaInternacionalCommand(receptor);

        Invocador invocador = new Invocador();

        invocador.ejecutarComando(entregaLocal);
        invocador.ejecutarComando(entregaNacional);
        invocador.ejecutarComando(entregaInternacional);
    }
}
