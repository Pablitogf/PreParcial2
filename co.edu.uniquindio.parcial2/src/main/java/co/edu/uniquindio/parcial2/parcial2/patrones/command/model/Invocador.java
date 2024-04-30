package co.edu.uniquindio.parcial2.parcial2.patrones.command.model;

import co.edu.uniquindio.parcial2.parcial2.patrones.command.services.Command;

class Invocador {
    public void ejecutarComando(Command comando) {
        comando.execute();
    }
}
