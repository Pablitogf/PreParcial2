package co.edu.uniquindio.parcial2.parcial2.patrones.command.model;

import co.edu.uniquindio.parcial2.parcial2.patrones.command.services.Command;

public class Cliente {
    public static void main(String[] args) {
        // Crear receptor
        Receptor receptor = new Receptor();

        // Crear comandos de entrega
        Command entregaLocal = new EntregaLocalCommand(receptor);
        Command entregaNacional = new EntregaNacionalCommand(receptor);
        Command entregaInternacional = new EntregaInternacionalCommand(receptor);

        // Crear invocador
        Invocador invocador = new Invocador();

        // Ejecutar comandos de entrega
        invocador.ejecutarComando(entregaLocal);
        invocador.ejecutarComando(entregaNacional);
        invocador.ejecutarComando(entregaInternacional);
    }
}
